// Generated by Haxe 3.4.2 (git build master @ 890f8c7)
package zephyr.controller;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Controller extends haxe.lang.HxObject
{
	public Controller(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Controller()
	{
		//line 30 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\controller\\Controller.hx"
		zephyr.controller.Controller.__hx_ctor_zephyr_controller_Controller(this);
	}
	
	
	public static void __hx_ctor_zephyr_controller_Controller(zephyr.controller.Controller __hx_this)
	{
	}
	
	
	public zephyr.app.ApplicationContext context;
	
	public void onEnter()
	{
	}
	
	
	public void setPage(zephyr.page.Page page)
	{
		//line 59 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\controller\\Controller.hx"
		this.context.setView(page.layout());
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 30 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\controller\\Controller.hx"
		{
			//line 30 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\controller\\Controller.hx"
			boolean __temp_executeDef1 = true;
			//line 30 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\controller\\Controller.hx"
			switch (field.hashCode())
			{
				case 951530927:
				{
					//line 30 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\controller\\Controller.hx"
					if (field.equals("context")) 
					{
						//line 30 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\controller\\Controller.hx"
						__temp_executeDef1 = false;
						//line 30 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\controller\\Controller.hx"
						this.context = ((zephyr.app.ApplicationContext) (value) );
						//line 30 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\controller\\Controller.hx"
						return value;
					}
					
					//line 30 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\controller\\Controller.hx"
					break;
				}
				
				
			}
			
			//line 30 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\controller\\Controller.hx"
			if (__temp_executeDef1) 
			{
				//line 30 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\controller\\Controller.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 30 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\controller\\Controller.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 30 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\controller\\Controller.hx"
		{
			//line 30 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\controller\\Controller.hx"
			boolean __temp_executeDef1 = true;
			//line 30 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\controller\\Controller.hx"
			switch (field.hashCode())
			{
				case 1984860689:
				{
					//line 30 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\controller\\Controller.hx"
					if (field.equals("setPage")) 
					{
						//line 30 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\controller\\Controller.hx"
						__temp_executeDef1 = false;
						//line 30 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\controller\\Controller.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setPage")) );
					}
					
					//line 30 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\controller\\Controller.hx"
					break;
				}
				
				
				case 951530927:
				{
					//line 30 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\controller\\Controller.hx"
					if (field.equals("context")) 
					{
						//line 30 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\controller\\Controller.hx"
						__temp_executeDef1 = false;
						//line 30 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\controller\\Controller.hx"
						return this.context;
					}
					
					//line 30 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\controller\\Controller.hx"
					break;
				}
				
				
				case -1349985223:
				{
					//line 30 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\controller\\Controller.hx"
					if (field.equals("onEnter")) 
					{
						//line 30 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\controller\\Controller.hx"
						__temp_executeDef1 = false;
						//line 30 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\controller\\Controller.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "onEnter")) );
					}
					
					//line 30 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\controller\\Controller.hx"
					break;
				}
				
				
			}
			
			//line 30 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\controller\\Controller.hx"
			if (__temp_executeDef1) 
			{
				//line 30 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\controller\\Controller.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 30 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\controller\\Controller.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 30 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\controller\\Controller.hx"
		{
			//line 30 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\controller\\Controller.hx"
			boolean __temp_executeDef1 = true;
			//line 30 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\controller\\Controller.hx"
			switch (field.hashCode())
			{
				case 1984860689:
				{
					//line 30 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\controller\\Controller.hx"
					if (field.equals("setPage")) 
					{
						//line 30 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\controller\\Controller.hx"
						__temp_executeDef1 = false;
						//line 30 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\controller\\Controller.hx"
						this.setPage(((zephyr.page.Page) (dynargs.__get(0)) ));
					}
					
					//line 30 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\controller\\Controller.hx"
					break;
				}
				
				
				case -1349985223:
				{
					//line 30 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\controller\\Controller.hx"
					if (field.equals("onEnter")) 
					{
						//line 30 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\controller\\Controller.hx"
						__temp_executeDef1 = false;
						//line 30 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\controller\\Controller.hx"
						this.onEnter();
					}
					
					//line 30 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\controller\\Controller.hx"
					break;
				}
				
				
			}
			
			//line 30 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\controller\\Controller.hx"
			if (__temp_executeDef1) 
			{
				//line 30 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\controller\\Controller.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 30 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\controller\\Controller.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 30 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\controller\\Controller.hx"
		baseArr.push("context");
		//line 30 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\controller\\Controller.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


