package dao;

import java.util.List;

import logic.Item;

// �߻�ȭ�� �����Ͻ� ����..
public interface ItemDao {
	List<Item> findAll();
	
// �߰�..
	
	Item findByPrimaryKey(Integer itemId);
}
