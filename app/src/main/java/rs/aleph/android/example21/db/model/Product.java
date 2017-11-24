package rs.aleph.android.example21.db.model;

/**
 * Created by KaraklicDM on 22.11.2017.
 */



        import com.j256.ormlite.field.DatabaseField;
        import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by milossimic on 11/4/16.
 */
@DatabaseTable(tableName = Product.TABLE_NAME_USERS)
public class Product {

    public static final String TABLE_NAME_USERS = "product";

    public static final String FIELD_NAME_ID     = "id";
    public static final String FIELD_NAME_NAME   = "name";
    public static final String FIELD_NAME_DESCRIPTION   = "description";
    public static final String FIELD_NAME_RATING   = "rating";
    public static final String FIELD_NAME_CATEGORY   = "category";
    public static final String FIELD_NAME_IMAGE  = "image";


    @DatabaseField(columnName = FIELD_NAME_ID, generatedId = true)
    private int mId;

    @DatabaseField(columnName = FIELD_NAME_NAME)
    private String mName;

    @DatabaseField(columnName = FIELD_NAME_DESCRIPTION)
    private String description;

    @DatabaseField(columnName = FIELD_NAME_RATING)
    private float rating;

    @DatabaseField(columnName = FIELD_NAME_CATEGORY,foreign = true,foreignAutoRefresh = true)
    private Category category;

    @DatabaseField(columnName = FIELD_NAME_IMAGE)
    private String image;

    //ORMLite zahteva prazan konstuktur u klasama koje opisuju tabele u bazi!
    public Product() {
    }

    /** Getters & Setters **/

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return  mName;
    }
}
