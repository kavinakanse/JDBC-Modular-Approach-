package com.controller;

import com.service.BankService;

public class BankController {

	public static void main(String[] args) throws Exception {
		BankService bs = new BankService();
//		bs.insertData();
//		bs.updateData();
//		bs.deleteData();
		bs.getAllData();
	}

}
