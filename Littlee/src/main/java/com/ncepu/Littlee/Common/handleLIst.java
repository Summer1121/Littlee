package com.ncepu.Littlee.Common;

import java.util.ArrayList;
import java.util.List;

//处理以“,”分割的字符串
public class handleLIst {
	// 返回元素组成的list
	static public List<Integer> getList(String str) {
		String[] strs;
		strs = str.split(",");
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < strs.length; i++) {
			list.add(0, Integer.parseInt(strs[i]));
		}
		return list;
	}

	// 返回元素数量
	static public int getCount(String str) {
		if (str == null)
			return 0;
		else
			return getList(str).size();

	}
}
