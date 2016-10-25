package co.creativev.bootcamp.got;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.annotation.DrawableRes;
import android.support.annotation.StringDef;
import android.widget.ImageView;

public class DetailViewModel {

    private GoTCharacter gotCharacter;
    private Context context;

    public DetailViewModel(GoTCharacter gotCharacter, Context context) {
        this.gotCharacter = gotCharacter;
        this.context = context;
    }

    public Drawable getHouseResId() {
        return context.getResources().getDrawable(gotCharacter.getHouseResId());
    }

    public String getDescription() {
        return gotCharacter.getDescription();
    }

    public String getHouseName() {
        return gotCharacter.getHouse();
    }

    public int getDescriptionColor() {
        return gotCharacter.isAlive() ? Color.GREEN : Color.RED;
    }

    public String getCharacterImageUrl() {
        return gotCharacter.getFullUrl();
    }

}
