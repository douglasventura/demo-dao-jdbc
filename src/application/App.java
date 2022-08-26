package application;

import java.time.Instant;
import java.util.List;

import modeldao.DaoFactory;
import modeldao.SellerDao;
import modelentities.Department;
import modelentities.Seller;

public class App {
    public static void main(String[] args) {
        
        System.out.println("=== TEST 1: Seller findById ===");
        SellerDao sellerDao = DaoFactory.createSellerDao();
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);
        
        System.out.println("=== TEST 2: Seller findByDepartment ===");
        Department department = new Department(2, null);
        List<Seller> sellers = sellerDao.findByDepartment(department);
        
        for (Seller s : sellers) {
            System.out.println(s);
        }

        System.out.println("=== TEST 3: Seller findAll ===");
        sellers = sellerDao.findAll();
        
        for (Seller s : sellers) {
            System.out.println(s);
        }
        
        System.out.println("=== TEST 4: Seller insert ===");
        Seller newSeller = new Seller(null, "Greg Blue", "greg@gmail.com", Instant.now(), 4000.0, department);
        sellerDao.insert(newSeller);
        System.out.println("Inserted! New id = " + newSeller.getId());
    }
}
