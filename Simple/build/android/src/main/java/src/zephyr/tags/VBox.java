// Generated by Haxe 3.4.2 (git build master @ 890f8c7)
package zephyr.tags;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class VBox extends zephyr.tags.Tag
{
	public VBox(haxe.lang.EmptyObject empty)
	{
		//line 8 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\tags\\VBox.hx"
		super(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public VBox(haxe.root.Array<zephyr.tags.Tag> tags)
	{
		//line 15 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\tags\\VBox.hx"
		super(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
		//line 15 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\tags\\VBox.hx"
		zephyr.tags.VBox.__hx_ctor_zephyr_tags_VBox(this, tags);
	}
	
	
	public static void __hx_ctor_zephyr_tags_VBox(zephyr.tags.VBox __hx_this, haxe.root.Array<zephyr.tags.Tag> tags)
	{
		//line 15 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\tags\\VBox.hx"
		zephyr.tags.Tag.__hx_ctor_zephyr_tags_Tag(__hx_this, tags);
	}
	
	
	@Override public android.view.View render(android.content.Context context)
	{
		//line 24 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\tags\\VBox.hx"
		android.widget.LinearLayout layout = new android.widget.LinearLayout(context);
		//line 25 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\tags\\VBox.hx"
		layout.setOrientation(((int) (android.widget.LinearLayout.VERTICAL) ));
		//line 26 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\tags\\VBox.hx"
		layout.setWeightSum(((float) (1) ));
		//line 27 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\tags\\VBox.hx"
		android.widget.LinearLayout.LayoutParams params = new android.widget.LinearLayout.LayoutParams(((int) (-1) ), ((int) (-1) ));
		//line 29 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\tags\\VBox.hx"
		haxe.root.Array<android.view.View> childs = this.renderChilds(context);
		//line 30 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\tags\\VBox.hx"
		{
			//line 30 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\tags\\VBox.hx"
			int _g = 0;
			//line 30 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\tags\\VBox.hx"
			while (( _g < childs.length ))
			{
				//line 30 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\tags\\VBox.hx"
				android.view.View i = childs.__get(_g);
				//line 30 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\tags\\VBox.hx"
				 ++ _g;
				//line 31 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\tags\\VBox.hx"
				layout.addView(((android.view.View) (i) ));
			}
			
		}
		
		//line 34 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\tags\\VBox.hx"
		layout.setLayoutParams(((android.view.ViewGroup.LayoutParams) (params) ));
		//line 36 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\tags\\VBox.hx"
		return layout;
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 8 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\tags\\VBox.hx"
		{
			//line 8 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\tags\\VBox.hx"
			boolean __temp_executeDef1 = true;
			//line 8 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\tags\\VBox.hx"
			switch (field.hashCode())
			{
				case -934592106:
				{
					//line 8 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\tags\\VBox.hx"
					if (field.equals("render")) 
					{
						//line 8 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\tags\\VBox.hx"
						__temp_executeDef1 = false;
						//line 8 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\tags\\VBox.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "render")) );
					}
					
					//line 8 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\tags\\VBox.hx"
					break;
				}
				
				
			}
			
			//line 8 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\tags\\VBox.hx"
			if (__temp_executeDef1) 
			{
				//line 8 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\tags\\VBox.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 8 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\tags\\VBox.hx"
				throw null;
			}
			
		}
		
	}
	
	
}


