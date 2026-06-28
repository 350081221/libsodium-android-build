package com.lody.virtual.server.pm.installer;

import android.annotation.TargetApi;

@TargetApi(21)
/* loaded from: classes3.dex */
public class PackageHelper {
    public static final int DELETE_FAILED_ABORTED = -5;
    public static final int DELETE_FAILED_DEVICE_POLICY_MANAGER = -2;
    public static final int DELETE_FAILED_INTERNAL_ERROR = -1;
    public static final int DELETE_FAILED_OWNER_BLOCKED = -4;
    public static final int DELETE_FAILED_USER_RESTRICTED = -3;
    public static final int DELETE_SUCCEEDED = 1;
    public static final int INSTALL_FAILED_ABORTED = -115;
    public static final int INSTALL_FAILED_ALREADY_EXISTS = -1;
    public static final int INSTALL_FAILED_CONFLICTING_PROVIDER = -13;
    public static final int INSTALL_FAILED_CONTAINER_ERROR = -18;
    public static final int INSTALL_FAILED_CPU_ABI_INCOMPATIBLE = -16;
    public static final int INSTALL_FAILED_DEXOPT = -11;
    public static final int INSTALL_FAILED_DUPLICATE_PACKAGE = -5;
    public static final int INSTALL_FAILED_DUPLICATE_PERMISSION = -112;
    public static final int INSTALL_FAILED_EPHEMERAL_INVALID = -116;
    public static final int INSTALL_FAILED_INSUFFICIENT_STORAGE = -4;
    public static final int INSTALL_FAILED_INTERNAL_ERROR = -110;
    public static final int INSTALL_FAILED_INVALID_APK = -2;
    public static final int INSTALL_FAILED_INVALID_INSTALL_LOCATION = -19;
    public static final int INSTALL_FAILED_INVALID_URI = -3;
    public static final int INSTALL_FAILED_MEDIA_UNAVAILABLE = -20;
    public static final int INSTALL_FAILED_MISSING_FEATURE = -17;
    public static final int INSTALL_FAILED_MISSING_SHARED_LIBRARY = -9;
    public static final int INSTALL_FAILED_NEWER_SDK = -14;
    public static final int INSTALL_FAILED_NO_MATCHING_ABIS = -113;
    public static final int INSTALL_FAILED_NO_SHARED_USER = -6;
    public static final int INSTALL_FAILED_OLDER_SDK = -12;
    public static final int INSTALL_FAILED_PACKAGE_CHANGED = -23;
    public static final int INSTALL_FAILED_PERMISSION_MODEL_DOWNGRADE = -26;
    public static final int INSTALL_FAILED_REPLACE_COULDNT_DELETE = -10;
    public static final int INSTALL_FAILED_SHARED_USER_INCOMPATIBLE = -8;
    public static final int INSTALL_FAILED_TEST_ONLY = -15;
    public static final int INSTALL_FAILED_UID_CHANGED = -24;
    public static final int INSTALL_FAILED_UPDATE_INCOMPATIBLE = -7;
    public static final int INSTALL_FAILED_USER_RESTRICTED = -111;
    public static final int INSTALL_FAILED_VERIFICATION_FAILURE = -22;
    public static final int INSTALL_FAILED_VERIFICATION_TIMEOUT = -21;
    public static final int INSTALL_FAILED_VERSION_DOWNGRADE = -25;
    public static final int INSTALL_PARSE_FAILED_BAD_MANIFEST = -101;
    public static final int INSTALL_PARSE_FAILED_BAD_PACKAGE_NAME = -106;
    public static final int INSTALL_PARSE_FAILED_BAD_SHARED_USER_ID = -107;
    public static final int INSTALL_PARSE_FAILED_CERTIFICATE_ENCODING = -105;
    public static final int INSTALL_PARSE_FAILED_INCONSISTENT_CERTIFICATES = -104;
    public static final int INSTALL_PARSE_FAILED_MANIFEST_EMPTY = -109;
    public static final int INSTALL_PARSE_FAILED_MANIFEST_MALFORMED = -108;
    public static final int INSTALL_PARSE_FAILED_NOT_APK = -100;
    public static final int INSTALL_PARSE_FAILED_NO_CERTIFICATES = -103;
    public static final int INSTALL_PARSE_FAILED_UNEXPECTED_EXCEPTION = -102;
    public static final int INSTALL_SUCCEEDED = 1;
    public static final int MOVE_FAILED_DEVICE_ADMIN = -8;
    public static final int MOVE_FAILED_DOESNT_EXIST = -2;
    public static final int MOVE_FAILED_FORWARD_LOCKED = -4;
    public static final int MOVE_FAILED_INSUFFICIENT_STORAGE = -1;
    public static final int MOVE_FAILED_INTERNAL_ERROR = -6;
    public static final int MOVE_FAILED_INVALID_LOCATION = -5;
    public static final int MOVE_FAILED_OPERATION_PENDING = -7;
    public static final int MOVE_FAILED_SYSTEM_PACKAGE = -3;
    public static final int MOVE_SUCCEEDED = -100;
    public static final int NO_NATIVE_LIBRARIES = -114;

    public static String deleteStatusToString(boolean z4) {
        return z4 ? "DELETE_SUCCEEDED" : "DELETE_FAILED";
    }

    public static int installStatusToPublicStatus(int i5) {
        if (i5 == -115) {
            return 3;
        }
        if (i5 == 1) {
            return 0;
        }
        switch (i5) {
            case -113:
                return 7;
            case -112:
                return 5;
            case -111:
                return 7;
            default:
                switch (i5) {
                    default:
                        switch (i5) {
                            case INSTALL_FAILED_PERMISSION_MODEL_DOWNGRADE /* -26 */:
                            case INSTALL_FAILED_VERSION_DOWNGRADE /* -25 */:
                            case INSTALL_FAILED_UID_CHANGED /* -24 */:
                            case INSTALL_FAILED_PACKAGE_CHANGED /* -23 */:
                                break;
                            case INSTALL_FAILED_VERIFICATION_FAILURE /* -22 */:
                            case INSTALL_FAILED_VERIFICATION_TIMEOUT /* -21 */:
                                return 3;
                            case INSTALL_FAILED_MEDIA_UNAVAILABLE /* -20 */:
                            case INSTALL_FAILED_INVALID_INSTALL_LOCATION /* -19 */:
                            case INSTALL_FAILED_CONTAINER_ERROR /* -18 */:
                                return 6;
                            case INSTALL_FAILED_MISSING_FEATURE /* -17 */:
                            case INSTALL_FAILED_CPU_ABI_INCOMPATIBLE /* -16 */:
                                return 7;
                            case -15:
                                return 4;
                            case -14:
                                return 7;
                            case -13:
                                return 5;
                            case -12:
                                return 7;
                            case -11:
                                return 4;
                            case -10:
                                return 5;
                            case -9:
                                return 7;
                            case -8:
                            case -7:
                            case -6:
                            case -5:
                                return 5;
                            case -4:
                                return 6;
                            case -3:
                            case -2:
                                return 4;
                            case -1:
                                return 5;
                            default:
                                return 1;
                        }
                    case INSTALL_PARSE_FAILED_MANIFEST_EMPTY /* -109 */:
                    case INSTALL_PARSE_FAILED_MANIFEST_MALFORMED /* -108 */:
                    case INSTALL_PARSE_FAILED_BAD_SHARED_USER_ID /* -107 */:
                    case INSTALL_PARSE_FAILED_BAD_PACKAGE_NAME /* -106 */:
                    case INSTALL_PARSE_FAILED_CERTIFICATE_ENCODING /* -105 */:
                    case INSTALL_PARSE_FAILED_INCONSISTENT_CERTIFICATES /* -104 */:
                    case INSTALL_PARSE_FAILED_NO_CERTIFICATES /* -103 */:
                    case INSTALL_PARSE_FAILED_UNEXPECTED_EXCEPTION /* -102 */:
                    case -101:
                    case -100:
                        return 4;
                }
        }
    }

    public static String installStatusToString(int i5, String str) {
        String installStatusToString = installStatusToString(i5);
        if (str == null) {
            return installStatusToString;
        }
        return installStatusToString + ": " + str;
    }

    public static String installStatusToString(int i5) {
        if (i5 == -115) {
            return "INSTALL_FAILED_ABORTED";
        }
        if (i5 == 1) {
            return "INSTALL_SUCCEEDED";
        }
        switch (i5) {
            case -113:
                return "INSTALL_FAILED_NO_MATCHING_ABIS";
            case -112:
                return "INSTALL_FAILED_DUPLICATE_PERMISSION";
            case -111:
                return "INSTALL_FAILED_USER_RESTRICTED";
            case -110:
                return "INSTALL_FAILED_INTERNAL_ERROR";
            case INSTALL_PARSE_FAILED_MANIFEST_EMPTY /* -109 */:
                return "INSTALL_PARSE_FAILED_MANIFEST_EMPTY";
            case INSTALL_PARSE_FAILED_MANIFEST_MALFORMED /* -108 */:
                return "INSTALL_PARSE_FAILED_MANIFEST_MALFORMED";
            case INSTALL_PARSE_FAILED_BAD_SHARED_USER_ID /* -107 */:
                return "INSTALL_PARSE_FAILED_BAD_SHARED_USER_ID";
            case INSTALL_PARSE_FAILED_BAD_PACKAGE_NAME /* -106 */:
                return "INSTALL_PARSE_FAILED_BAD_PACKAGE_NAME";
            case INSTALL_PARSE_FAILED_CERTIFICATE_ENCODING /* -105 */:
                return "INSTALL_PARSE_FAILED_CERTIFICATE_ENCODING";
            case INSTALL_PARSE_FAILED_INCONSISTENT_CERTIFICATES /* -104 */:
                return "INSTALL_PARSE_FAILED_INCONSISTENT_CERTIFICATES";
            case INSTALL_PARSE_FAILED_NO_CERTIFICATES /* -103 */:
                return "INSTALL_PARSE_FAILED_NO_CERTIFICATES";
            case INSTALL_PARSE_FAILED_UNEXPECTED_EXCEPTION /* -102 */:
                return "INSTALL_PARSE_FAILED_UNEXPECTED_EXCEPTION";
            case -101:
                return "INSTALL_PARSE_FAILED_BAD_MANIFEST";
            case -100:
                return "INSTALL_PARSE_FAILED_NOT_APK";
            default:
                switch (i5) {
                    case INSTALL_FAILED_VERSION_DOWNGRADE /* -25 */:
                        return "INSTALL_FAILED_VERSION_DOWNGRADE";
                    case INSTALL_FAILED_UID_CHANGED /* -24 */:
                        return "INSTALL_FAILED_UID_CHANGED";
                    case INSTALL_FAILED_PACKAGE_CHANGED /* -23 */:
                        return "INSTALL_FAILED_PACKAGE_CHANGED";
                    case INSTALL_FAILED_VERIFICATION_FAILURE /* -22 */:
                        return "INSTALL_FAILED_VERIFICATION_FAILURE";
                    case INSTALL_FAILED_VERIFICATION_TIMEOUT /* -21 */:
                        return "INSTALL_FAILED_VERIFICATION_TIMEOUT";
                    case INSTALL_FAILED_MEDIA_UNAVAILABLE /* -20 */:
                        return "INSTALL_FAILED_MEDIA_UNAVAILABLE";
                    case INSTALL_FAILED_INVALID_INSTALL_LOCATION /* -19 */:
                        return "INSTALL_FAILED_INVALID_INSTALL_LOCATION";
                    case INSTALL_FAILED_CONTAINER_ERROR /* -18 */:
                        return "INSTALL_FAILED_CONTAINER_ERROR";
                    case INSTALL_FAILED_MISSING_FEATURE /* -17 */:
                        return "INSTALL_FAILED_MISSING_FEATURE";
                    case INSTALL_FAILED_CPU_ABI_INCOMPATIBLE /* -16 */:
                        return "INSTALL_FAILED_CPU_ABI_INCOMPATIBLE";
                    case -15:
                        return "INSTALL_FAILED_TEST_ONLY";
                    case -14:
                        return "INSTALL_FAILED_NEWER_SDK";
                    case -13:
                        return "INSTALL_FAILED_CONFLICTING_PROVIDER";
                    case -12:
                        return "INSTALL_FAILED_OLDER_SDK";
                    case -11:
                        return "INSTALL_FAILED_DEXOPT";
                    case -10:
                        return "INSTALL_FAILED_REPLACE_COULDNT_DELETE";
                    case -9:
                        return "INSTALL_FAILED_MISSING_SHARED_LIBRARY";
                    case -8:
                        return "INSTALL_FAILED_SHARED_USER_INCOMPATIBLE";
                    case -7:
                        return "INSTALL_FAILED_UPDATE_INCOMPATIBLE";
                    case -6:
                        return "INSTALL_FAILED_NO_SHARED_USER";
                    case -5:
                        return "INSTALL_FAILED_DUPLICATE_PACKAGE";
                    case -4:
                        return "INSTALL_FAILED_INSUFFICIENT_STORAGE";
                    case -3:
                        return "INSTALL_FAILED_INVALID_URI";
                    case -2:
                        return "INSTALL_FAILED_INVALID_APK";
                    case -1:
                        return "INSTALL_FAILED_ALREADY_EXISTS";
                    default:
                        return Integer.toString(i5);
                }
        }
    }
}
