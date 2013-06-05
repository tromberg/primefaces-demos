package tos.fw.web.sandbox.bean;

import java.util.HashMap;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;

@ManagedBean
@ViewScoped
public class DummyBean {
   private final Map<String, Object> theMap = new HashMap<String, Object>();
      
   public Map<String, Object> getTheMap() {
      return theMap;
   }

   public void printResult(ActionEvent event) {
      printResult();
   }
   
   public String printResult() {
      System.out.println("map:" + theMap.toString());
      return null;
   }

}