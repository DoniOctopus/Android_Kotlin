package com.enigmacamp.mandiricode

class CustomerRepository (private  val customerDao: CustomerDao){
    suspend fun getCustomer() = customerDao.getCustomerAll()
    suspend fun getCustomerById(id:Int) = customerDao.getCustomerById(id)
    suspend fun registerNewCustomer(customer: Customer) = customerDao.insert(customer)
    suspend fun deletedCustomer(customer: Customer) = customerDao.delete(customer)

}