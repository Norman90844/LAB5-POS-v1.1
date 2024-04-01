//package ee.ut.math.tvt.salessystem.dataobjects;

//package ee.ut.math.tvt.salessystem.logic;
//package ee.ut.math.tvt.salessystem.dao;

import org.junit.Test;
import static org.junit.Assert.*;
import ee.ut.math.tvt.salessystem.dataobjects.StockItem;

import ee.ut.math.tvt.salessystem.logic.ShoppingCart;
import org.junit.Test;
import static org.junit.Assert.*;
import ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO;
import ee.ut.math.tvt.salessystem.dataobjects.SoldItem;
import java.util.List;

import ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO;
import org.junit.Test;
import static org.junit.Assert.*;
import ee.ut.math.tvt.salessystem.dataobjects.SoldItem;
import ee.ut.math.tvt.salessystem.dataobjects.StockItem;
import java.util.List;

public class POSGT {

	@Test(timeout = 4000)
	public void testBeginTransaction() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    inMemorySalesSystemDAO0.beginTransaction();
	}

	@Test(timeout = 4000)
	public void testRollbackTransaction() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    inMemorySalesSystemDAO0.rollbackTransaction();
	}

	@Test(timeout = 4000)
	public void testCommitTransaction() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    inMemorySalesSystemDAO0.commitTransaction();
	}

	@Test(timeout = 4000)
	public void testFindStockItems() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    List<StockItem> list0 = inMemorySalesSystemDAO0.findStockItems();
	    assertEquals(4, list0.size());
	}

	@Test(timeout = 4000)
	public void testFindStockItemReturningNull() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    StockItem stockItem0 = inMemorySalesSystemDAO0.findStockItem(0L);
	    assertNull(stockItem0);
	}

	@Test(timeout = 4000)
	public void testSaveStockItem() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    Long long0 = new Long(0L);
	    StockItem stockItem0 = new StockItem(long0, "", "", 0L, (-1));
	    inMemorySalesSystemDAO0.saveStockItem(stockItem0);
	    StockItem stockItem1 = inMemorySalesSystemDAO0.findStockItem(0L);
	    assertEquals((-1), stockItem1.getQuantity());
	    assertNotNull(stockItem1);
	}

	@Test(timeout = 4000)
	public void testSaveSoldItem() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    SoldItem soldItem0 = new SoldItem();
	    inMemorySalesSystemDAO0.saveSoldItem(soldItem0);
	    assertNull(soldItem0.getName());
	}


	@Test(timeout = 4000)
	public void testGetAll() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    ShoppingCart shoppingCart0 = new ShoppingCart(inMemorySalesSystemDAO0);
	    List<SoldItem> list0 = shoppingCart0.getAll();
	    assertTrue(list0.isEmpty());
	}

	@Test(timeout = 4000)
	public void testCancelCurrentPurchase() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    ShoppingCart shoppingCart0 = new ShoppingCart(inMemorySalesSystemDAO0);
	    shoppingCart0.cancelCurrentPurchase();
	}

	@Test(timeout = 4000)
	public void testCreatesShoppingCart() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    ShoppingCart shoppingCart0 = new ShoppingCart(inMemorySalesSystemDAO0);
	    shoppingCart0.submitCurrentPurchase();
	}

	@Test(timeout = 4000)
	public void testAddItem() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    ShoppingCart shoppingCart0 = new ShoppingCart(inMemorySalesSystemDAO0);
	    shoppingCart0.addItem((SoldItem) null);
	    shoppingCart0.submitCurrentPurchase();
	}


	@Test(timeout = 4000)
	public void testGetId() throws Throwable {
	    StockItem stockItem0 = new StockItem();
	    SoldItem soldItem0 = new SoldItem(stockItem0, 389);
	    soldItem0.getId();
	    assertEquals(389, (int) soldItem0.getQuantity());
	}

	@Test(timeout = 4000)
	public void testSetId() throws Throwable {
	    SoldItem soldItem0 = new SoldItem();
	    Long long0 = new Long(0L);
	    soldItem0.setId(long0);
	    assertEquals(0L, (long) soldItem0.getId());
	}

	@Test(timeout = 4000)
	public void testGetName() throws Throwable {
	    SoldItem soldItem0 = new SoldItem();
	    String string0 = soldItem0.getName();
	    assertNull(string0);
	}

	@Test(timeout = 4000)
	public void testGetPrice() throws Throwable {
	    SoldItem soldItem0 = new SoldItem();
	    double double0 = soldItem0.getPrice();
	    assertEquals(0.0, double0, 0.01);
	}

	@Test(timeout = 4000)
	public void testToString() throws Throwable {
	    SoldItem soldItem0 = new SoldItem();
	    String string0 = soldItem0.toString();
	    assertEquals("SoldItem{id=null, name='null'}", string0);
	}

	@Test(timeout = 4000)
	public void testGetStockItem() throws Throwable {
	    SoldItem soldItem0 = new SoldItem();
	    StockItem stockItem0 = soldItem0.getStockItem();
	    assertNull(stockItem0);
	}

	@Test(timeout = 4000)
	public void testSetPrice() throws Throwable {
	    SoldItem soldItem0 = new SoldItem();
	    soldItem0.setPrice(0.0);
	    assertEquals(0.0, soldItem0.getPrice(), 0.01);
	}

	@Test(timeout = 4000)
	public void testSetQuantity() throws Throwable {
	    SoldItem soldItem0 = new SoldItem();
	    Integer integer0 = new Integer((-3567));
	    soldItem0.setQuantity(integer0);
	    assertEquals((-3567), (int) soldItem0.getQuantity());
	}

	@Test(timeout = 4000)
	public void testGetSum() throws Throwable {
	    SoldItem soldItem0 = new SoldItem();
	    // Undeclared exception!
	    soldItem0.getSum();
	}

	@Test(timeout = 4000)
	public void testSetName() throws Throwable {
	    SoldItem soldItem0 = new SoldItem();
	    soldItem0.setName((String) null);
	    assertNull(soldItem0.getQuantity());
	}

	@Test(timeout = 4000)
	public void testGetQuantity() throws Throwable {
	    StockItem stockItem0 = new StockItem();
	    SoldItem soldItem0 = new SoldItem(stockItem0, 1362);
	    Integer integer0 = soldItem0.getQuantity();
	    assertEquals(1362, (int) integer0);
	}

	@Test(timeout = 4000)
	public void testSetStockItem() throws Throwable {
	    SoldItem soldItem0 = new SoldItem();
	    StockItem stockItem0 = new StockItem();
	    soldItem0.setStockItem(stockItem0);
	    assertEquals(0.0, soldItem0.getPrice(), 0.01);
	}

}