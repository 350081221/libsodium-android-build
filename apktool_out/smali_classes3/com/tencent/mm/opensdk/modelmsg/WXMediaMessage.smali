.class public final Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage$Builder;,
        Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage$IMediaObject;
    }
.end annotation


# static fields
.field public static final ACTION_WXAPPMESSAGE:Ljava/lang/String; = "com.tencent.mm.sdk.openapi.Intent.ACTION_WXAPPMESSAGE"

.field public static final DESCRIPTION_LENGTH_LIMIT:I = 0x400

.field public static final MEDIA_TAG_NAME_LENGTH_LIMIT:I = 0x40

.field public static final MESSAGE_ACTION_LENGTH_LIMIT:I = 0x800

.field public static final MESSAGE_EXT_LENGTH_LIMIT:I = 0x800

.field public static final MINI_PROGRAM__THUMB_LENGHT:I = 0x20000

.field public static final NATIVE_GAME__THUMB_LIMIT:I = 0x40000

.field private static final TAG:Ljava/lang/String; = "MicroMsg.SDK.WXMediaMessage"

.field public static final THUMB_LENGTH_LIMIT:I = 0x10000

.field public static final TITLE_LENGTH_LIMIT:I = 0x200


# instance fields
.field public description:Ljava/lang/String;

.field public mediaObject:Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage$IMediaObject;

.field public mediaTagName:Ljava/lang/String;

.field public messageAction:Ljava/lang/String;

.field public messageExt:Ljava/lang/String;

.field public msgSignature:Ljava/lang/String;

.field public sdkVer:I

.field public thumbData:[B

.field public thumbDataHash:Ljava/lang/String;

.field public title:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;-><init>(Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage$IMediaObject;)V

    return-void
.end method

.method public constructor <init>(Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage$IMediaObject;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->mediaObject:Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage$IMediaObject;

    return-void
.end method


# virtual methods
.method checkArgs()Z
    .locals 6

    invoke-virtual {p0}, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->getType()I

    move-result v0

    const/16 v1, 0x8

    const-string v2, "MicroMsg.SDK.WXMediaMessage"

    const/4 v3, 0x0

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->thumbData:[B

    if-eqz v0, :cond_0

    array-length v0, v0

    if-nez v0, :cond_1

    :cond_0
    const-string v0, "checkArgs fail, thumbData should not be null when send emoji"

    :goto_0
    invoke-static {v2, v0}, Lcom/tencent/mm/opensdk/utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    return v3

    :cond_1
    invoke-virtual {p0}, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->getType()I

    move-result v0

    const/16 v1, 0x4c

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->title:Ljava/lang/String;

    invoke-static {v0}, Lcom/tencent/mm/opensdk/utils/b;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "checkArgs fail, Type = Music Video, but title == null"

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->getType()I

    move-result v0

    invoke-static {v0}, Lcom/tencent/mm/opensdk/utils/b;->a(I)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->thumbData:[B

    if-eqz v0, :cond_3

    array-length v0, v0

    const/high16 v1, 0x20000

    if-le v0, v1, :cond_4

    :cond_3
    const-string v0, "checkArgs fail, thumbData should not be null or exceed 128kb"

    goto :goto_0

    :cond_4
    invoke-virtual {p0}, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->getType()I

    move-result v0

    const/16 v1, 0x65

    const/4 v4, 0x1

    if-ne v0, v1, :cond_5

    move v0, v4

    goto :goto_1

    :cond_5
    move v0, v3

    :goto_1
    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->thumbData:[B

    if-eqz v0, :cond_6

    array-length v0, v0

    const/high16 v5, 0x40000

    if-le v0, v5, :cond_7

    :cond_6
    const-string v0, "checkArgs fail, thumbData should not be null or exceed 256KB"

    goto :goto_0

    :cond_7
    invoke-virtual {p0}, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->getType()I

    move-result v0

    invoke-static {v0}, Lcom/tencent/mm/opensdk/utils/b;->a(I)Z

    move-result v0

    if-nez v0, :cond_a

    invoke-virtual {p0}, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->getType()I

    move-result v0

    if-ne v0, v1, :cond_8

    move v0, v4

    goto :goto_2

    :cond_8
    move v0, v3

    :goto_2
    if-eqz v0, :cond_9

    goto :goto_3

    :cond_9
    move v4, v3

    :cond_a
    :goto_3
    if-nez v4, :cond_b

    iget-object v0, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->thumbData:[B

    if-eqz v0, :cond_b

    array-length v0, v0

    const/high16 v1, 0x10000

    if-le v0, v1, :cond_b

    const-string v0, "checkArgs fail, thumbData is invalid"

    goto :goto_0

    :cond_b
    iget-object v0, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->title:Ljava/lang/String;

    if-eqz v0, :cond_c

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x200

    if-le v0, v1, :cond_c

    const-string v0, "checkArgs fail, title is invalid"

    goto :goto_0

    :cond_c
    iget-object v0, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->description:Ljava/lang/String;

    if-eqz v0, :cond_d

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x400

    if-le v0, v1, :cond_d

    const-string v0, "checkArgs fail, description is invalid"

    goto/16 :goto_0

    :cond_d
    iget-object v0, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->mediaObject:Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage$IMediaObject;

    if-nez v0, :cond_e

    const-string v0, "checkArgs fail, mediaObject is null"

    goto/16 :goto_0

    :cond_e
    iget-object v0, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->mediaTagName:Ljava/lang/String;

    if-eqz v0, :cond_f

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x40

    if-le v0, v1, :cond_f

    const-string v0, "checkArgs fail, mediaTagName is too long"

    goto/16 :goto_0

    :cond_f
    iget-object v0, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->messageAction:Ljava/lang/String;

    const/16 v1, 0x800

    if-eqz v0, :cond_10

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-le v0, v1, :cond_10

    const-string v0, "checkArgs fail, messageAction is too long"

    goto/16 :goto_0

    :cond_10
    iget-object v0, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->messageExt:Ljava/lang/String;

    if-eqz v0, :cond_11

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-le v0, v1, :cond_11

    const-string v0, "checkArgs fail, messageExt is too long"

    goto/16 :goto_0

    :cond_11
    iget-object v0, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->mediaObject:Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage$IMediaObject;

    invoke-interface {v0}, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage$IMediaObject;->checkArgs()Z

    move-result v0

    return v0
.end method

.method public getType()I
    .locals 1

    iget-object v0, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->mediaObject:Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage$IMediaObject;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-interface {v0}, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage$IMediaObject;->type()I

    move-result v0

    return v0
.end method

.method public setThumbImage(Landroid/graphics/Bitmap;)V
    .locals 3

    :try_start_0
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    sget-object v1, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v2, 0x55

    invoke-virtual {p1, v1, v2, v0}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p1

    iput-object p1, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->thumbData:[B

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "setThumbImage exception:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "MicroMsg.SDK.WXMediaMessage"

    invoke-static {v0, p1}, Lcom/tencent/mm/opensdk/utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method
