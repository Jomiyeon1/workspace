package spring.model2.control;

/*
 컨트롤러 역할중 
 - 모델과 뷰 연결 : objectscope 사용
 - 네비게이션 : forward / sedredirect 이용
 - 두 역할의 정적인 부분만 모델링한 빈 
 */

public class ModelAndView {
	
	//field 
	private String viewName;
	private String modelName;
	private Object modelObject;
	
	
	//constructor
	public ModelAndView() {
	}
	public ModelAndView(String viewName) {
		this.viewName = viewName;
	}
	public ModelAndView(String viewName, String modelName, Object modelObject) {
		this.viewName = viewName;
		this.modelName = modelName;
		this.modelObject = modelObject;
	}
	
	//Method
	public String getViewName() {
		return viewName;
	}
	public void setViewName(String viewName) {
		this.viewName = viewName;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public Object getModelObject() {
		return modelObject;
	}
	public void setModelObject(Object modelObject) {
		this.modelObject = modelObject;
	}
	
} // end of class
