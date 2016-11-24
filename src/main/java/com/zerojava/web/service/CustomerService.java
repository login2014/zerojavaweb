package com.zerojava.web.service;

import com.zerojava.web.model.Customer;
import com.zerojava.web.util.DatabaseHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/11/22.
 */
public class CustomerService {

    private static final Logger logger = LoggerFactory.getLogger(Customer.class);

    public List<Customer> getCustomerList() {
        //未将数据库查询和连接抽取出来之前
//        Connection conn = null;
//        List<Customer> customerList = new ArrayList<>();
//        try {
//            String sql = "SELECT * FROM customer";
//            conn = DatabaseHelper.getConnection();
//            PreparedStatement statement = null;
//            statement = conn.prepareStatement(sql);
//            ResultSet rs = statement.executeQuery();
//            while (rs.next()) {
//                Customer customer = new Customer();
//                customer.setId(rs.getLong("id"));
//                customer.setName(rs.getString("name"));
//                customer.setContact(rs.getString("contact"));
//                customer.setTelephone(rs.getString("telephone"));
//                customer.setEmail(rs.getString("email"));
//                customer.setRemark(rs.getString("remark"));
//                customerList.add(customer);
//            }
//            return customerList;
//        } catch (SQLException e) {
//            logger.error("execute sql failure", e);
//        }finally {
//            DatabaseHelper.closeConnection(conn);
//        }
//        return null;

//        未抽取增删改查实体
        String sql = "SELECT * FROM customer";
        return DatabaseHelper.queryEntityList(Customer.class, sql);
    }

    public Customer getCustomer(long id) {
        String sql = "SELECT * FROM customer";
        return DatabaseHelper.queryEntity(Customer.class, sql, id);
    }

    public boolean createCustomer(Map<String, Object> fieldMap) {
//        TODO
        return DatabaseHelper.insertEntity(Customer.class, fieldMap);
    }

    public boolean updateCustomer(long id, Map<String, Object> fieldMap) {
//        TODO
        return DatabaseHelper.updateEntity(Customer.class, id, fieldMap);
    }

    public boolean deleteCustomer(long id) {
//        TODO
        return DatabaseHelper.deleteEntity(Customer.class, id);
    }
}
