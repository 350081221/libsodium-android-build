.class public Lcom/lody/virtual/helper/compat/ContentResolverCompat;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final SYNC_ERROR_AUTHENTICATION:I = 0x2

.field public static final SYNC_ERROR_CONFLICT:I = 0x5

.field public static final SYNC_ERROR_INTERNAL:I = 0x8

.field public static final SYNC_ERROR_IO:I = 0x3

.field private static final SYNC_ERROR_NAMES:[Ljava/lang/String;

.field public static final SYNC_ERROR_PARSE:I = 0x4

.field public static final SYNC_ERROR_SYNC_ALREADY_IN_PROGRESS:I = 0x1

.field public static final SYNC_ERROR_TOO_MANY_DELETIONS:I = 0x6

.field public static final SYNC_ERROR_TOO_MANY_RETRIES:I = 0x7

.field public static final SYNC_EXTRAS_DISALLOW_METERED:Ljava/lang/String; = "allow_metered"

.field public static final SYNC_EXTRAS_EXPECTED_DOWNLOAD:Ljava/lang/String; = "expected_download"

.field public static final SYNC_EXTRAS_EXPECTED_UPLOAD:Ljava/lang/String; = "expected_upload"

.field public static final SYNC_EXTRAS_PRIORITY:Ljava/lang/String; = "sync_priority"

.field public static final SYNC_OBSERVER_TYPE_STATUS:I = 0x8


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    const-string v0, "already-in-progress"

    .line 2
    .line 3
    const-string v1, "authentication-error"

    .line 4
    .line 5
    const-string v2, "io-error"

    .line 6
    .line 7
    const-string v3, "parse-error"

    .line 8
    .line 9
    const-string v4, "conflict"

    .line 10
    .line 11
    const-string v5, "too-many-deletions"

    .line 12
    .line 13
    const-string v6, "too-many-retries"

    .line 14
    .line 15
    const-string v7, "internal-error"

    .line 16
    .line 17
    filled-new-array/range {v0 .. v7}, [Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sput-object v0, Lcom/lody/virtual/helper/compat/ContentResolverCompat;->SYNC_ERROR_NAMES:[Ljava/lang/String;

    .line 22
    .line 23
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static syncErrorToString(I)Ljava/lang/String;
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-lt p0, v0, :cond_1

    .line 3
    .line 4
    sget-object v1, Lcom/lody/virtual/helper/compat/ContentResolverCompat;->SYNC_ERROR_NAMES:[Ljava/lang/String;

    .line 5
    .line 6
    array-length v2, v1

    .line 7
    if-le p0, v2, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    sub-int/2addr p0, v0

    .line 11
    aget-object p0, v1, p0

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_1
    :goto_0
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method
