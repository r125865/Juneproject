package org.Botcatpageexe;

import org.Bobcabulitity.Baseclass;
import org.Bobcatlocator.LoadersLocator;


import org.openqa.selenium.By;

public class LoadersPageExecutive extends LoadersLocator {
	public static void geturl () {
		url("https://www.bobcat.com/index");
	}
		public static void alertButton() {
		click(findEleByXpath(alertaccept));
	}
		public static void locator () {
			click(findEleByXpath(categorypage));
		}
		public static void compact () {
			click(findEleByXpath(compacttrack));
		}
		public static void T450model () {
			click(findEleByXpath(botcatt450));
		}
		public static void Arrow () {
			waits(wait);
			waits(wait1);
		}
		
}
