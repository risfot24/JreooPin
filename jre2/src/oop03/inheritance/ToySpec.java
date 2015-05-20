package oop03.inheritance;

import java.util.HashMap;
import java.util.Map;

public class ToySpec {
    private Map<String,Object> properties;
    
	public ToySpec(){
		properties = new HashMap<String,Object>();
	}
	
	public Map<String, Object> getProperties(){
		return properties;
		
	}

	public void setProperties(Map<String, Object> properties) {
		this.properties = properties;
	
	}
	
	
	
	/*�ʿ� Ű��, �Ӽ��� �߰� */
	public void setProperty(String pName, Object pValue){
		properties.put(pName,pValue);
		
	}
	/*Ű���� ���� �Ӽ��� �ҷ�����*/
	public Object getProperty(String pname){
		return properties.get(pname);
	}
	
	/*�� �˻�*/
	public boolean match(ToySpec spec){
		String specStr = "";
		String thisStr = "";
	
	    if(spec.getProperties("ToyUser")!=null){
	    	specStr += spec.getProperties("ToyUser");
	    	thisStr += getProperties("ToyUser");
	    } 
	    if(spec.getProperties("ToyType")!=null){
	    	specStr += spec.getProperties("ToyType");
	    	thisStr += getProperties("ToyUser");
	    }
	
	     return spec.equals(thisStr);
	
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return properties.toString();
	}
	
	
	
}
