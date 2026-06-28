.class public Lcom/tencent/vasdolly/common/ChannelConstants;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final CHANNEL_BLOCK_ID:I = -0x77eeaa01

.field public static final CONTENT_CHARSET:Ljava/lang/String; = "UTF-8"

.field static final SHORT_LENGTH:I = 0x2

.field static final V1_MAGIC:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    new-array v0, v0, [B

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/tencent/vasdolly/common/ChannelConstants;->V1_MAGIC:[B

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 1
        0x6ct
        0x74t
        0x6ct
        0x6ft
        0x76t
        0x65t
        0x7at
        0x68t
    .end array-data
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
