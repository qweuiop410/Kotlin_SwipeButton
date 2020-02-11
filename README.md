### SWIPE TO UNLOCK

<img src="https://postfiles.pstatic.net/MjAyMDAyMTFfMzcg/MDAxNTgxMzk4ODI0OTIz.6HChEwYh1JeEm1FAWeYR8Cfx8CB61097R6ZCFn993H4g.yolDIrHLT-cYv1N5RTS7gPxUqgF1WkqbhXj1FXghKcsg.PNG.whdals410/unlock.png?type=w773" width="40%" height="30%" title="px(픽셀) 크기 설정" alt="IMG"></img>
<img src="https://postfiles.pstatic.net/MjAyMDAyMTFfNzEg/MDAxNTgxMzk4Njk0MTc4.RLwD3FMw7mhkjbYdMbN9LO1awHR9DQVQmnkXTLgtplsg.u0hTuiRi_fRGhCfTYBDS_tGkDq_VJqoJuZ5qkczrAvkg.PNG.whdals410/lock.png?type=w773" width="40%" height="30%" title="px(픽셀) 크기 설정" alt="IMG"></img>

+ build.gradle(Module:app)
```
implementation 'com.ebanx:swipe-button:0.4.0'
```
+ layout
```xml
 <com.ebanx.swipebtn.SwipeButton
        android:id="@+id/SwipeButton_button"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginStart="20dp"
        android:layout_marginEnd="20dp"
        android:layout_centerInParent="true"
        app:inner_text="SWIPE TO UNLOCK"
        app:inner_text_color="@android:color/white"
        app:inner_text_size="16sp"
        app:inner_text_bottom_padding="18dp"
        app:inner_text_top_padding="18dp"
        app:inner_text_background="@drawable/shape_rounded"
        app:button_image_disabled="@drawable/ic_lock_open_black_24dp"
        app:button_image_enabled="@drawable/ic_lock_outline_black_24dp"
        app:button_left_padding="20dp"
        app:button_right_padding="20dp"
        app:button_top_padding="20dp"
        app:button_bottom_padding="20dp"
        app:button_background="@drawable/shape_button"
        />
```
+ MainActivity.kt
``` kotlin
var swipebutton:SwipeButton = findViewById(R.id.SwipeButton_button)
        swipebutton.setOnStateChangeListener{

            //실행할때 마다 표시
            Toast.makeText(this,"Active  " + it,Toast.LENGTH_SHORT).show()

        }
```
