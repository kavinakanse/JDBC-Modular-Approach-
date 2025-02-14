package com.service;

import com.dao.BankDao;

public class BankService {
	public void insertData() throws Exception {
		BankDao bd = new BankDao();
		bd.insertData();
	}

	public void updateData() throws Exception {
		BankDao bd = new BankDao();
		bd.updateData();
	}

	public void deleteData() throws Exception {
		BankDao bd = new BankDao();
		bd.deleteData();
		
	}

	public void getAllData() throws Exception {
		BankDao bd = new BankDao();
		bd.getAllData();
		
	}
}
