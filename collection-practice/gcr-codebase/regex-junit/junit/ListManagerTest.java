package com.junit.practice.junitTesting;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class ListManagerTest {
	private final ListManager manager = new ListManager();
	
	@Test
	void testAddElement() {
		List<Integer> list = new ArrayList<>();
		manager.addElement(list,10);
		assertTrue(list.contains(10));
	}
	@Test
    void testRemoveElement() {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        manager.removeElement(list, 10);
        assertFalse(list.contains(10));
    }

    @Test
    void testListSize() {
        List<Integer> list = new ArrayList<>();
        manager.addElement(list, 1);
        manager.addElement(list, 2);
        assertEquals(2, manager.getSize(list));
    }
}
