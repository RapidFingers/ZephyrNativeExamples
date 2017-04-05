// Generated by Haxe 3.4.2 (git build master @ 890f8c7)
package zephyr.app;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class ApplicationContext extends haxe.lang.HxObject
{
	public ApplicationContext(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public ApplicationContext(zephyr.app.ZephyrActivity owner)
	{
		//line 47 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
		zephyr.app.ApplicationContext.__hx_ctor_zephyr_app_ApplicationContext(this, owner);
	}
	
	
	public static void __hx_ctor_zephyr_app_ApplicationContext(zephyr.app.ApplicationContext __hx_this, zephyr.app.ZephyrActivity owner)
	{
		//line 48 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
		__hx_this.owner = owner;
		//line 49 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
		__hx_this.controllers = new haxe.ds.StringMap<zephyr.controller.Controller>();
	}
	
	
	public zephyr.app.ZephyrActivity owner;
	
	public haxe.ds.StringMap<zephyr.controller.Controller> controllers;
	
	public zephyr.controller.Controller currentController;
	
	public void registerController(java.lang.Class cls)
	{
		//line 57 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
		java.lang.String controllerName = haxe.root.Type.getClassName(cls);
		//line 58 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
		zephyr.controller.Controller controller = ((zephyr.controller.Controller) (haxe.root.Type.createInstance(((java.lang.Class) (cls) ), ((haxe.root.Array) (new haxe.root.Array(new java.lang.Object[]{})) ))) );
		//line 59 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
		controller.context = this;
		//line 60 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
		((haxe.ds.StringMap<zephyr.controller.Controller>) (((haxe.IMap<java.lang.String, zephyr.controller.Controller>) (this.controllers) )) ).set(controllerName, controller);
	}
	
	
	public void navigate(java.lang.Class cls)
	{
		//line 68 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
		java.lang.String name = haxe.root.Type.getClassName(cls);
		//line 69 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
		zephyr.controller.Controller controller = ((zephyr.controller.Controller) (((haxe.ds.StringMap<zephyr.controller.Controller>) (((haxe.IMap<java.lang.String, zephyr.controller.Controller>) (this.controllers) )) ).get(name)) );
		//line 71 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
		controller.onEnter();
		//line 72 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
		this.currentController = controller;
	}
	
	
	public void setView(zephyr.tags.Tag view)
	{
		//line 80 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
		android.view.View view1 = view.render(this.owner);
		//line 81 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
		this.owner.setContentView(((android.view.View) (view1) ));
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 27 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
		{
			//line 27 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
			boolean __temp_executeDef1 = true;
			//line 27 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
			switch (field.hashCode())
			{
				case 1582053877:
				{
					//line 27 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
					if (field.equals("currentController")) 
					{
						//line 27 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
						__temp_executeDef1 = false;
						//line 27 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
						this.currentController = ((zephyr.controller.Controller) (value) );
						//line 27 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
						return value;
					}
					
					//line 27 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
					break;
				}
				
				
				case 106164915:
				{
					//line 27 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
					if (field.equals("owner")) 
					{
						//line 27 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
						__temp_executeDef1 = false;
						//line 27 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
						this.owner = ((zephyr.app.ZephyrActivity) (value) );
						//line 27 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
						return value;
					}
					
					//line 27 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
					break;
				}
				
				
				case -1714548649:
				{
					//line 27 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
					if (field.equals("controllers")) 
					{
						//line 27 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
						__temp_executeDef1 = false;
						//line 27 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
						this.controllers = ((haxe.ds.StringMap<zephyr.controller.Controller>) (value) );
						//line 27 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
						return value;
					}
					
					//line 27 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
					break;
				}
				
				
			}
			
			//line 27 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
			if (__temp_executeDef1) 
			{
				//line 27 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 27 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 27 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
		{
			//line 27 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
			boolean __temp_executeDef1 = true;
			//line 27 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
			switch (field.hashCode())
			{
				case 1985047079:
				{
					//line 27 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
					if (field.equals("setView")) 
					{
						//line 27 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
						__temp_executeDef1 = false;
						//line 27 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setView")) );
					}
					
					//line 27 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
					break;
				}
				
				
				case 106164915:
				{
					//line 27 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
					if (field.equals("owner")) 
					{
						//line 27 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
						__temp_executeDef1 = false;
						//line 27 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
						return this.owner;
					}
					
					//line 27 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
					break;
				}
				
				
				case 2102494577:
				{
					//line 27 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
					if (field.equals("navigate")) 
					{
						//line 27 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
						__temp_executeDef1 = false;
						//line 27 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "navigate")) );
					}
					
					//line 27 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
					break;
				}
				
				
				case -1714548649:
				{
					//line 27 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
					if (field.equals("controllers")) 
					{
						//line 27 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
						__temp_executeDef1 = false;
						//line 27 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
						return this.controllers;
					}
					
					//line 27 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
					break;
				}
				
				
				case 1986576031:
				{
					//line 27 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
					if (field.equals("registerController")) 
					{
						//line 27 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
						__temp_executeDef1 = false;
						//line 27 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "registerController")) );
					}
					
					//line 27 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
					break;
				}
				
				
				case 1582053877:
				{
					//line 27 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
					if (field.equals("currentController")) 
					{
						//line 27 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
						__temp_executeDef1 = false;
						//line 27 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
						return this.currentController;
					}
					
					//line 27 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
					break;
				}
				
				
			}
			
			//line 27 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
			if (__temp_executeDef1) 
			{
				//line 27 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 27 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 27 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
		{
			//line 27 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
			boolean __temp_executeDef1 = true;
			//line 27 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
			switch (field.hashCode())
			{
				case 1985047079:
				{
					//line 27 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
					if (field.equals("setView")) 
					{
						//line 27 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
						__temp_executeDef1 = false;
						//line 27 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
						this.setView(((zephyr.tags.Tag) (dynargs.__get(0)) ));
					}
					
					//line 27 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
					break;
				}
				
				
				case 1986576031:
				{
					//line 27 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
					if (field.equals("registerController")) 
					{
						//line 27 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
						__temp_executeDef1 = false;
						//line 27 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
						this.registerController(((java.lang.Class) (dynargs.__get(0)) ));
					}
					
					//line 27 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
					break;
				}
				
				
				case 2102494577:
				{
					//line 27 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
					if (field.equals("navigate")) 
					{
						//line 27 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
						__temp_executeDef1 = false;
						//line 27 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
						this.navigate(((java.lang.Class) (dynargs.__get(0)) ));
					}
					
					//line 27 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
					break;
				}
				
				
			}
			
			//line 27 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
			if (__temp_executeDef1) 
			{
				//line 27 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 27 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 27 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
		baseArr.push("currentController");
		//line 27 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
		baseArr.push("controllers");
		//line 27 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
		baseArr.push("owner");
		//line 27 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\app\\ApplicationContext.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


