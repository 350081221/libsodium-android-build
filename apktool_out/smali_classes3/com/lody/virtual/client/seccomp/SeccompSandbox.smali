.class public Lcom/lody/virtual/client/seccomp/SeccompSandbox;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final MOUNT_FLAG_DIR:I = 0x2

.field public static final MOUNT_FLAG_FILE:I = 0x1

.field public static final MOUNT_FLAG_FORBIDDEN:I = 0x8

.field public static final MOUNT_FLAG_KEEP:I = 0x4

.field private static final TAG:Ljava/lang/String; = "Sandbox"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static native _nativeMount_(Ljava/lang/String;Ljava/lang/String;I)I
.end method

.method private static native _nativeSetup_()I
.end method

.method private static native _nativeStart_(Z)I
.end method

.method private static native _nativeTranslateToGuestPath_(Ljava/lang/String;)Ljava/lang/String;
.end method

.method private static native _nativeTranslateToHostPath_(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public static nativeMount(Ljava/lang/String;Ljava/lang/String;I)I
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/lody/virtual/client/seccomp/SeccompSandbox;->_nativeMount_(Ljava/lang/String;Ljava/lang/String;I)I

    move-result p0

    return p0
.end method

.method public static nativeSetup()I
    .locals 1

    invoke-static {}, Lcom/lody/virtual/client/seccomp/SeccompSandbox;->_nativeSetup_()I

    move-result v0

    return v0
.end method

.method public static nativeStart(Z)I
    .locals 0

    invoke-static {p0}, Lcom/lody/virtual/client/seccomp/SeccompSandbox;->_nativeStart_(Z)I

    move-result p0

    return p0
.end method

.method public static nativeTranslateToGuestPath(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/lody/virtual/client/seccomp/SeccompSandbox;->_nativeTranslateToGuestPath_(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static nativeTranslateToHostPath(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/lody/virtual/client/seccomp/SeccompSandbox;->_nativeTranslateToHostPath_(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
