package modeldao;

import java.util.List;

import modelentities.Department;
import modelentities.Seller;

public interface SellerDao {
    
    void insert(Seller obj);
    void update(Seller obj);
    void deleteById(Integer id);
    Seller findById(Integer id);
    List<Seller> findAll();
    List<Seller> findByDepartment(Department department);
}
