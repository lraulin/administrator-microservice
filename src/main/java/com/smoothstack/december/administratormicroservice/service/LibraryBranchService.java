package com.smoothstack.december.administratormicroservice.service;

import com.smoothstack.december.administratormicroservice.dao.LibraryBranchDAO;
import com.smoothstack.december.administratormicroservice.entity.LibraryBranch;
import com.smoothstack.december.administratormicroservice.exception.IllegalRelationReferenceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class LibraryBranchService {
    @Autowired
    private LibraryBranchDAO libraryBranchDAO;

    public LibraryBranch getLibraryBranch(long id) {
        Optional<LibraryBranch> libraryBranch = libraryBranchDAO.findById(id);
        libraryBranch.orElseThrow(()-> new IllegalRelationReferenceException("No libraryBranch with id " + id));
        return libraryBranch.get();
    }
    public List<LibraryBranch> getLibraryBranches() {
        return libraryBranchDAO.findAll();
    }

    public LibraryBranch setLibraryBranch(LibraryBranch libraryBranch) {
        return libraryBranchDAO.save(libraryBranch);
    }

    public void deleteLibraryBranch(LibraryBranch libraryBranch) {
        libraryBranchDAO.delete(libraryBranch);
    }
}
