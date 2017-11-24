package rs.aleph.android.example21.db.model;

/**
 * Created by KaraklicDM on 22.11.2017.
 */


import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by KaraklicDM on 9.11.2017.
 */
@DatabaseTable(tableName = Category.TABLE_NAME_USERS)
public class Category {
    public static final String TABLE_NAME_USERS = "category";

    public static final String FIELD_NAME_ID = "id";
    public static final String FIELD_NAME_NAME = "name";
    public static final String FIELD_NAME_PRODUCT = "product";
    public static final String FIELD_NAME_IMAGE = "image";



    @DatabaseField(columnName = FIELD_NAME_ID,generatedId = true)
    private int mId;

    @DatabaseField(columnName = FIELD_NAME_NAME)
    private String mName;

    @ForeignCollectionField(columnName = FIELD_NAME_PRODUCT, eager = true)
    private ForeignCollection<Product> mProducts;



    @DatabaseField(columnName = Category.FIELD_NAME_IMAGE)
    private String mImage;


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

    public ForeignCollection<Product> getmProducts() {
        return mProducts;
    }

    public void setmProducts(ForeignCollection<Product> mProducts) {
        this.mProducts = mProducts;
    }

    public String getmImage() {
        return mImage;
    }

    public void setmImage(String mImage) {
        this.mImage = mImage;
    }

    public Category() {
    }

    public Category(int mId, String mName) {
        this.mId = mId;
        this.mName = mName;
    }

    @Override
    public String toString() {
        return mName;
    }
}
