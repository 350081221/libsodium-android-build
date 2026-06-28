.class public final Lcom/huawei/hms/common/data/DataBufferUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final ARGS_BUNDLE:I = 0x4

.field public static final ARGS_COLUMN:I = 0x1

.field public static final ARGS_CURSOR:I = 0x2

.field public static final ARGS_STATUS:I = 0x3

.field public static final ARGS_VERSION:I = 0x3e8

.field public static final NEXT_PAGE:Ljava/lang/String; = "next_page"

.field public static final PREV_PAGE:Ljava/lang/String; = "prev_page"


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static containKey(Landroid/os/Bundle;Ljava/lang/String;)Z
    .locals 1

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0, p1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_1

    const/4 v0, 0x1

    :cond_1
    return v0
.end method

.method public static freezeAndClose(Lcom/huawei/hms/common/data/DataBuffer;)Ljava/util/ArrayList;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "E::",
            "Lcom/huawei/hms/common/data/Freezable<",
            "TT;>;>(",
            "Lcom/huawei/hms/common/data/DataBuffer<",
            "TE;>;)",
            "Ljava/util/ArrayList<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-interface {p0}, Lcom/huawei/hms/common/data/DataBuffer;->getCount()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 8
    .line 9
    .line 10
    invoke-interface {p0}, Lcom/huawei/hms/common/data/DataBuffer;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, Lcom/huawei/hms/common/data/Freezable;

    .line 25
    .line 26
    invoke-interface {v2}, Lcom/huawei/hms/common/data/Freezable;->freeze()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-interface {p0}, Lcom/huawei/hms/common/data/DataBuffer;->release()V

    .line 35
    .line 36
    .line 37
    return-object v0
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
.end method

.method public static hasData(Lcom/huawei/hms/common/data/DataBuffer;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/huawei/hms/common/data/DataBuffer<",
            "*>;)Z"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    :cond_0
    invoke-interface {p0}, Lcom/huawei/hms/common/data/DataBuffer;->getCount()I

    move-result p0

    if-lez p0, :cond_1

    const/4 v0, 0x1

    :cond_1
    return v0
.end method

.method public static hasNextPage(Lcom/huawei/hms/common/data/DataBuffer;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/huawei/hms/common/data/DataBuffer<",
            "*>;)Z"
        }
    .end annotation

    invoke-interface {p0}, Lcom/huawei/hms/common/data/DataBuffer;->getMetadata()Landroid/os/Bundle;

    move-result-object p0

    const-string v0, "next_page"

    invoke-static {p0, v0}, Lcom/huawei/hms/common/data/DataBufferUtils;->containKey(Landroid/os/Bundle;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static hasPrevPage(Lcom/huawei/hms/common/data/DataBuffer;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/huawei/hms/common/data/DataBuffer<",
            "*>;)Z"
        }
    .end annotation

    invoke-interface {p0}, Lcom/huawei/hms/common/data/DataBuffer;->getMetadata()Landroid/os/Bundle;

    move-result-object p0

    const-string v0, "prev_page"

    invoke-static {p0, v0}, Lcom/huawei/hms/common/data/DataBufferUtils;->containKey(Landroid/os/Bundle;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method
