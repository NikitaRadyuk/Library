package by.itac.mylibrary.service.impl;

import by.itac.mylibrary.dao.CRUDBookDAO;
import by.itac.mylibrary.dao.DAOProvider;
import by.itac.mylibrary.entity.Book;
import by.itac.mylibrary.service.BookService;

public class BookServiceImpl implements BookService {

	public void save(Book book) {
		//1 VALIDATION INPUT DATA
		
		DAOProvider provider = DAOProvider.getInstance();
		CRUDBookDAO dao = provider.getBookDAO();
		dao.save(book);
		
	}

	public Book findByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
