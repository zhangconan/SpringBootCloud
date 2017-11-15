package com.zkn.springboot.exercise.endpoint;/**
 * Created by zkn on 2017/11/15.
 */

import org.springframework.boot.actuate.endpoint.AbstractEndpoint;
import org.springframework.stereotype.Component;

import java.lang.management.*;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zkn
 * @date 2017/11/15 22:50
 */
@Component
public class ThreadInfoEndpoint extends AbstractEndpoint<Map<String, Object>> {

    public ThreadInfoEndpoint() {
        //id
        super("threadInfo");
    }

    /**
     * Called to invoke the endpoint.
     *
     * @return the results of the invocation
     */
    @Override
    public Map<String, Object> invoke() {
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        //获取所有的线程信息
        ThreadInfo[] threadInfos = threadMXBean.dumpAllThreads(true, true);
        if (threadInfos != null && threadInfos.length > 0) {
            Map<String, Object> map = new HashMap<>(threadInfos.length);
            for (ThreadInfo threadInfo : threadInfos) {
                map.put(threadInfo.getThreadName(), getThreadDumpString(threadInfo));
            }
            return map;
        }
        return null;
    }

    /**
     * 组装线程信息
     *
     * @param threadInfo
     */
    private String getThreadDumpString(ThreadInfo threadInfo) {

        StringBuilder sb = new StringBuilder("threadName:" + threadInfo.getThreadName() + ",threadId:" + threadInfo.getThreadId() + ",threadStatus:" + threadInfo.getThreadState());
        //锁的名字
        if (threadInfo.getLockName() != null) {
            sb.append(",lockName:" + threadInfo.getLockName());
        }
        //锁的持有者
        if (threadInfo.getLockOwnerName() != null) {
            sb.append(",lockOwnerName:" + threadInfo.getLockOwnerName());
        }
        //线程中断
        if (threadInfo.isSuspended()) {
            sb.append(",suspended:" + threadInfo.isSuspended());
        }
        if (threadInfo.isInNative()) {
            sb.append(",inNative:" + threadInfo.isInNative());
        }
        sb.append("\n");

        StackTraceElement[] stackTraceElementst = threadInfo.getStackTrace();
        MonitorInfo[] monitorInfos = threadInfo.getLockedMonitors();
        StackTraceElement stackTraceElement;
        if (stackTraceElementst != null) {
            int i;
            for (i = 0; i < stackTraceElementst.length; i++) {
                stackTraceElement = stackTraceElementst[i];
                sb.append(",stackTraceElement:" + i + ";" + stackTraceElement.toString());
                if (i == 0 && threadInfo.getLockInfo() != null) {
                    Thread.State ts = threadInfo.getThreadState();
                    switch (ts) {
                        case BLOCKED:
                            sb.append("\t-  blocked on " + threadInfo.getLockInfo());
                            sb.append('\n');
                            break;
                        case WAITING:
                            sb.append("\t-  waiting on " + threadInfo.getLockInfo());
                            sb.append('\n');
                            break;
                        case TIMED_WAITING:
                            sb.append("\t-  waiting on " + threadInfo.getLockInfo());
                            sb.append('\n');
                            break;
                        default:
                    }
                }
                for (MonitorInfo mi : monitorInfos) {
                    if (mi.getLockedStackDepth() == i) {
                        sb.append("\t-  locked " + mi);
                        sb.append('\n');
                    }
                }
            }
            if (i < stackTraceElementst.length) {
                sb.append("\t...");
                sb.append('\n');
            }

            LockInfo[] locks = threadInfo.getLockedSynchronizers();
            if (locks.length > 0) {
                sb.append("\n\tNumber of locked synchronizers = " + locks.length);
                sb.append('\n');
                for (LockInfo li : locks) {
                    sb.append("\t- " + li);
                    sb.append('\n');
                }
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}




























