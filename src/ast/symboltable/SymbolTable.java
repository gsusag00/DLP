package ast.symboltable;

import java.util.*;
import ast.Definition;

public class SymbolTable {
	
	private int scope=0;
	private List<Map<String,Definition>> table;

	public SymbolTable()  {
		table = new ArrayList<>();
		set();
	}

	public void set() {
		Map<String,Definition> map = new HashMap<>();
		table.add(map);
		scope = table.size() - 1;
	}
	
	public void reset() {
		table.remove(table.size() - 1);
		scope--;
	}
	
	public boolean insert(Definition definition) {
		Map<String,Definition> map = table.get(table.size() - 1);
		if(map.get(definition.getName()) == null){
			table.get(table.size() - 1).put(definition.getName(), definition);
			definition.setScope(scope);
			return true;
		}
		return false;
	}
	
	public Definition find(String id) {
		for(int i = scope; i>=0; i--){
			Definition def = table.get(i).get(id);
			if(def!=null){
				return def;
			}
		}
		return null;
	}

	public Definition findInCurrentScope(String id) {
		Definition def = table.get(table.size() - 1).get(id);
		return def!=null? def : null;
	}
}
