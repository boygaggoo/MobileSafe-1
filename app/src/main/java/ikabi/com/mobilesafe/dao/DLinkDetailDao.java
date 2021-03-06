package ikabi.com.mobilesafe.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import dao.AbstractDao;
import dao.Property;
import dao.internal.DaoConfig;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * DAO for table "DLINK_DETAIL".
*/
public class DLinkDetailDao extends AbstractDao<DLinkDetail, Long> {

    public static final String TABLENAME = "DLINK_DETAIL";

    /**
     * Properties of entity DLinkDetail.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property DeviceId = new Property(1, String.class, "deviceId", false, "DEVICE_ID");
        public final static Property CreateTime = new Property(2, String.class, "createTime", false, "CREATE_TIME");
    };


    public DLinkDetailDao(DaoConfig config) {
        super(config);
    }
    
    public DLinkDetailDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"DLINK_DETAIL\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"DEVICE_ID\" TEXT," + // 1: deviceId
                "\"CREATE_TIME\" TEXT);"); // 2: createTime
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"DLINK_DETAIL\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, DLinkDetail entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String deviceId = entity.getDeviceId();
        if (deviceId != null) {
            stmt.bindString(2, deviceId);
        }
 
        String createTime = entity.getCreateTime();
        if (createTime != null) {
            stmt.bindString(3, createTime);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public DLinkDetail readEntity(Cursor cursor, int offset) {
        DLinkDetail entity = new DLinkDetail( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // deviceId
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2) // createTime
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, DLinkDetail entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setDeviceId(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setCreateTime(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(DLinkDetail entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(DLinkDetail entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
