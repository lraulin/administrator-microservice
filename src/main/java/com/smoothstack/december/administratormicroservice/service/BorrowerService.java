package com.smoothstack.december.administratormicroservice.service;

import com.smoothstack.december.administratormicroservice.dao.BookLoanDAO;
import com.smoothstack.december.administratormicroservice.dao.BorrowerDAO;
import com.smoothstack.december.administratormicroservice.entity.BookLoan;
import com.smoothstack.december.administratormicroservice.entity.Borrower;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class BorrowerService {
    @Autowired
    private BorrowerDAO BorrowerDAO;

    @Autowired
    private BookLoanDAO bookLoanDAO;

    public List<Borrower> getBorrowers() {
        return BorrowerDAO.findAll();
    }

    public Borrower setBorrower(Borrower Borrower) {
        return BorrowerDAO.save(Borrower);
    }

    public void deleteBorrower(Borrower Borrower) {
        BorrowerDAO.delete(Borrower);
    }

    public BookLoan updateDueDate(BookLoan bookLoan) {
        bookLoanDAO.save(bookLoan);
    }
}
