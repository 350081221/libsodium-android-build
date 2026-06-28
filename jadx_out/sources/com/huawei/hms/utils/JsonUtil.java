package com.huawei.hms.utils;

import android.text.TextUtils;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.support.log.common.Base64;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class JsonUtil {
    private static final String BYTE_BYTE = "_byte_";
    private static final String LIST_FIELD_VALUE = "_value_";
    private static final String LIST_ITEM_VALUE = "_list_item_";
    private static final String LIST_SIZE = "_list_size_";
    private static final String MAP_MAP = "_map_";
    private static final String NEXT_ITEM = "_next_item_";
    private static final String PRE_PKG = "com.huawei";
    private static final String TAG = "JsonUtil";
    protected static final int VAL_BYTE = 2;
    protected static final int VAL_ENTITY = 0;
    protected static final int VAL_LIST = 1;
    protected static final int VAL_MAP = 3;
    protected static final int VAL_NULL = -1;
    protected static final String VAL_TYPE = "_val_type_";

    private static String createInnerJsonString(IMessageEntity iMessageEntity) throws IllegalAccessException, JSONException {
        JSONObject jSONObject = new JSONObject();
        for (Class<?> cls = iMessageEntity.getClass(); cls != null; cls = cls.getSuperclass()) {
            for (Field field : cls.getDeclaredFields()) {
                if (field.isAnnotationPresent(Packed.class)) {
                    boolean isAccessible = field.isAccessible();
                    setAccessible(field, true);
                    String name = field.getName();
                    Object obj = field.get(iMessageEntity);
                    setAccessible(field, isAccessible);
                    disposeType(name, obj, jSONObject);
                }
            }
        }
        return jSONObject.toString();
    }

    public static String createJsonString(IMessageEntity iMessageEntity) {
        if (iMessageEntity == null) {
            HMSLog.e(TAG, "createJsonString error, the input IMessageEntity is null");
            return "";
        }
        try {
            return createInnerJsonString(iMessageEntity);
        } catch (IllegalAccessException e5) {
            HMSLog.e(TAG, "catch IllegalAccessException " + e5.getMessage());
            return "";
        } catch (JSONException e6) {
            HMSLog.e(TAG, "catch JSONException " + e6.getMessage());
            return "";
        }
    }

    private static boolean disposeType(String str, Object obj, JSONObject jSONObject) throws JSONException, IllegalAccessException {
        if (obj instanceof String) {
            jSONObject.put(str, (String) obj);
            return true;
        }
        if (obj instanceof Integer) {
            jSONObject.put(str, ((Integer) obj).intValue());
            return true;
        }
        if (obj instanceof Short) {
            jSONObject.put(str, (Short) obj);
            return true;
        }
        if (obj instanceof Long) {
            jSONObject.put(str, (Long) obj);
            return true;
        }
        if (obj instanceof Float) {
            jSONObject.put(str, (Float) obj);
            return true;
        }
        if (obj instanceof Double) {
            jSONObject.put(str, (Double) obj);
            return true;
        }
        if (obj instanceof Boolean) {
            jSONObject.put(str, (Boolean) obj);
            return true;
        }
        if (obj instanceof JSONObject) {
            jSONObject.put(str, (JSONObject) obj);
            return true;
        }
        if (obj instanceof byte[]) {
            writeByte(str, (byte[]) obj, jSONObject);
            return true;
        }
        if (obj instanceof List) {
            writeList(str, (List) obj, jSONObject);
            return true;
        }
        if (obj instanceof Map) {
            writeMap(str, (Map) obj, jSONObject);
            return true;
        }
        if (obj instanceof IMessageEntity) {
            try {
                jSONObject.put(str, createInnerJsonString((IMessageEntity) obj));
                return true;
            } catch (IllegalAccessException e5) {
                HMSLog.e(TAG, "IllegalAccessException , " + e5);
            }
        }
        return false;
    }

    public static Object getInfoFromJsonobject(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (!jSONObject.has(str2)) {
                    return null;
                }
                Object obj = jSONObject.get(str2);
                if (obj instanceof String) {
                    return obj;
                }
            } catch (JSONException unused) {
                HMSLog.e(TAG, "getInfoFromJsonobject:parser json error :" + str2);
            }
        }
        return null;
    }

    public static int getIntValue(JSONObject jSONObject, String str) throws JSONException {
        if (jSONObject != null && jSONObject.has(str)) {
            return jSONObject.getInt(str);
        }
        return -1;
    }

    private static Object getObjectValue(String str, JSONObject jSONObject) throws JSONException {
        if (jSONObject.has(str)) {
            return jSONObject.get(str);
        }
        if (jSONObject.has("header") && jSONObject.getJSONObject("header").has(str)) {
            return jSONObject.getJSONObject("header").get(str);
        }
        if (jSONObject.has("body") && jSONObject.getJSONObject("body").has(str)) {
            return jSONObject.getJSONObject("body").get(str);
        }
        return null;
    }

    public static String getStringValue(JSONObject jSONObject, String str) throws JSONException {
        if (jSONObject != null && jSONObject.has(str)) {
            return jSONObject.getString(str);
        }
        return null;
    }

    public static IMessageEntity jsonToEntity(String str, IMessageEntity iMessageEntity) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            for (Class<?> cls = iMessageEntity.getClass(); cls != null; cls = cls.getSuperclass()) {
                for (Field field : cls.getDeclaredFields()) {
                    if (field.isAnnotationPresent(Packed.class)) {
                        try {
                            readFiled(iMessageEntity, field, jSONObject);
                        } catch (IllegalAccessException unused) {
                            HMSLog.e(TAG, "jsonToEntity, set value of the field exception, field name:" + field.getName());
                        }
                    }
                }
            }
        } catch (JSONException e5) {
            HMSLog.e(TAG, "catch JSONException when parse jsonString" + e5.getMessage());
        }
        return iMessageEntity;
    }

    private static byte[] readByte(JSONObject jSONObject) throws JSONException {
        try {
            return Base64.decode(jSONObject.getString(BYTE_BYTE));
        } catch (IllegalArgumentException e5) {
            HMSLog.e(TAG, "readByte failed : " + e5.getMessage());
            return null;
        }
    }

    private static void readFiled(IMessageEntity iMessageEntity, Field field, JSONObject jSONObject) throws JSONException, IllegalAccessException {
        Object readJson = readJson(iMessageEntity, field, jSONObject);
        if (readJson != null) {
            boolean isAccessible = field.isAccessible();
            setAccessible(field, true);
            field.set(iMessageEntity, readJson);
            setAccessible(field, isAccessible);
        }
    }

    private static Object readJson(IMessageEntity iMessageEntity, Field field, JSONObject jSONObject) throws JSONException, IllegalAccessException {
        Object objectValue = getObjectValue(field.getName(), jSONObject);
        if (objectValue != null) {
            try {
                if (field.getType().getName().startsWith(PRE_PKG) && (field.getType().newInstance() instanceof IMessageEntity)) {
                    return jsonToEntity((String) objectValue, (IMessageEntity) field.getType().newInstance());
                }
                if ((objectValue instanceof JSONObject) && ((JSONObject) objectValue).has(VAL_TYPE)) {
                    int i5 = ((JSONObject) objectValue).getInt(VAL_TYPE);
                    if (i5 != 1 && i5 != 0) {
                        if (i5 == 2) {
                            return readByte((JSONObject) objectValue);
                        }
                        if (i5 == 3) {
                            return readMap(field.getGenericType(), (JSONObject) objectValue);
                        }
                        HMSLog.e(TAG, "cannot support type : " + i5);
                    }
                    return readList(field.getGenericType(), (JSONObject) objectValue);
                }
                return objectValue;
            } catch (InstantiationException unused) {
                HMSLog.e(TAG, "InstantiationException  ");
            }
        }
        return null;
    }

    private static List<Object> readList(Type type, JSONObject jSONObject) throws JSONException, IllegalAccessException, InstantiationException {
        int i5 = jSONObject.getInt(LIST_SIZE);
        int i6 = jSONObject.getInt(VAL_TYPE);
        ArrayList arrayList = new ArrayList(i5);
        for (int i7 = 0; i7 < i5; i7++) {
            Object obj = jSONObject.get(LIST_ITEM_VALUE + i7);
            if (i6 == 0) {
                arrayList.add(jsonToEntity((String) obj, (IMessageEntity) ((Class) ((ParameterizedType) type).getActualTypeArguments()[0]).newInstance()));
            } else if (i6 == 1) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private static Map readMap(Type type, JSONObject jSONObject) throws JSONException, IllegalAccessException, InstantiationException {
        Class cls = (Class) ((ParameterizedType) type).getActualTypeArguments()[1];
        JSONArray jSONArray = new JSONArray(jSONObject.getString(MAP_MAP));
        HashMap hashMap = new HashMap();
        for (int i5 = 0; i5 < jSONArray.length(); i5 += 2) {
            if (cls.newInstance() instanceof IMessageEntity) {
                hashMap.put(jSONArray.get(i5), jsonToEntity(jSONArray.getString(i5 + 1), (IMessageEntity) cls.newInstance()));
            } else {
                hashMap.put(jSONArray.get(i5), jSONArray.get(i5 + 1));
            }
        }
        return hashMap;
    }

    private static void setAccessible(final Field field, final boolean z4) {
        AccessController.doPrivileged(new PrivilegedAction() { // from class: com.huawei.hms.utils.JsonUtil.1
            @Override // java.security.PrivilegedAction
            public Object run() {
                field.setAccessible(z4);
                return null;
            }
        });
    }

    private static void writeByte(String str, byte[] bArr, JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(VAL_TYPE, 2);
        try {
            jSONObject2.put(BYTE_BYTE, Base64.encode(bArr));
        } catch (IllegalArgumentException e5) {
            HMSLog.e(TAG, "writeByte failed : " + e5.getMessage());
        }
        jSONObject.put(str, jSONObject2);
    }

    private static void writeList(String str, List<?> list, JSONObject jSONObject) throws JSONException, IllegalAccessException {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(VAL_TYPE, 1);
        jSONObject2.put(LIST_SIZE, list.size());
        for (int i5 = 0; i5 < list.size(); i5++) {
            disposeType(LIST_ITEM_VALUE + i5, list.get(i5), jSONObject2);
            if (list.get(i5) instanceof IMessageEntity) {
                jSONObject2.put(VAL_TYPE, 0);
            }
        }
        jSONObject.put(str, jSONObject2);
    }

    private static void writeMap(String str, Map map, JSONObject jSONObject) throws JSONException, IllegalAccessException {
        JSONArray jSONArray = new JSONArray();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (key instanceof IMessageEntity) {
                jSONArray.put(createInnerJsonString((IMessageEntity) key));
            } else {
                jSONArray.put(key);
            }
            if (value instanceof IMessageEntity) {
                jSONArray.put(createInnerJsonString((IMessageEntity) value));
            } else {
                jSONArray.put(value);
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(VAL_TYPE, 3);
        jSONObject2.put(MAP_MAP, jSONArray.toString());
        jSONObject.put(str, jSONObject2);
    }
}
