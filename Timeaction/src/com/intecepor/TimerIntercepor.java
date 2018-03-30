package com.intecepor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class TimerIntercepor extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		
		//定义拦截器的第一步：
		
		
	//执行action之前	
	long start=System.currentTimeMillis();
	//如果是还有下一个拦截去就虎丘调用下一个拦截器，如果是最后一个拦截器那么就会调用目标的action
	
	String result=invocation.invoke();
	//执行完action之后再一次统计时间
	
	long end=System.currentTimeMillis();
	
	System.out.println("花费了多长时间"+(end-start)+"ms");
	
	return result;
	
			
	}

}
