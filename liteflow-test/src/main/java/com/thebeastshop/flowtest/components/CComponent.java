/**
 * <p>Title: liteFlow</p>
 * <p>Description: 轻量级的组件式流程框架</p>
 * <p>Copyright: Copyright (c) 2017</p>
 * @author Bryan.Zhang
 * @email weenyc31@163.com
 * @Date 2017-8-1
 * @version 1.0
 */
package com.thebeastshop.flowtest.components;

import com.thebeastshop.liteflow.core.NodeComponent;
import org.springframework.stereotype.Component;

@Component("c")
public class CComponent extends NodeComponent {

	@Override
	public void process() {
		try {
			String[] temp = new String[4000];
			Thread.sleep(300L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Ccomponent executed!");

	}

}
