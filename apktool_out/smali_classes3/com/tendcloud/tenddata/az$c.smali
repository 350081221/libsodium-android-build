.class Lcom/tendcloud/tenddata/az$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tendcloud/tenddata/az;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation


# instance fields
.field private bsslist:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/tendcloud/tenddata/az$a;",
            ">;"
        }
    .end annotation
.end field

.field private bssmap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/tendcloud/tenddata/az$a;",
            ">;"
        }
    .end annotation
.end field

.field private poiId:J

.field final synthetic this$0:Lcom/tendcloud/tenddata/az;

.field private timestamp:I


# direct methods
.method constructor <init>(Lcom/tendcloud/tenddata/az;)V
    .locals 0

    iput-object p1, p0, Lcom/tendcloud/tenddata/az$c;->this$0:Lcom/tendcloud/tenddata/az;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method cloneFingerprint()Lcom/tendcloud/tenddata/az$c;
    .locals 4

    .line 1
    new-instance v0, Lcom/tendcloud/tenddata/az$c;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/tendcloud/tenddata/az$c;->this$0:Lcom/tendcloud/tenddata/az;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lcom/tendcloud/tenddata/az$c;-><init>(Lcom/tendcloud/tenddata/az;)V

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lcom/tendcloud/tenddata/az$c;->timestamp:I

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lcom/tendcloud/tenddata/az$c;->setTimestamp(I)V

    .line 11
    .line 12
    .line 13
    iget-wide v1, p0, Lcom/tendcloud/tenddata/az$c;->poiId:J

    .line 14
    .line 15
    invoke-virtual {v0, v1, v2}, Lcom/tendcloud/tenddata/az$c;->setPoiId(J)V

    .line 16
    .line 17
    .line 18
    new-instance v1, Ljava/util/LinkedList;

    .line 19
    .line 20
    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    .line 21
    .line 22
    .line 23
    iget-object v2, p0, Lcom/tendcloud/tenddata/az$c;->bsslist:Ljava/util/List;

    .line 24
    .line 25
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-eqz v3, :cond_0

    .line 34
    .line 35
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    check-cast v3, Lcom/tendcloud/tenddata/az$a;

    .line 40
    .line 41
    invoke-virtual {v3}, Lcom/tendcloud/tenddata/az$a;->cloneBssEntry()Lcom/tendcloud/tenddata/az$a;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    invoke-virtual {v0, v1}, Lcom/tendcloud/tenddata/az$c;->setBsslist(Ljava/util/List;)V

    .line 50
    .line 51
    .line 52
    return-object v0
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
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
.end method

.method getBsslist()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/tendcloud/tenddata/az$a;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/tendcloud/tenddata/az$c;->bsslist:Ljava/util/List;

    return-object v0
.end method

.method getBssmap(Z)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/tendcloud/tenddata/az$a;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/az$c;->bssmap:Ljava/util/Map;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    :cond_0
    new-instance p1, Ljava/util/HashMap;

    .line 8
    .line 9
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lcom/tendcloud/tenddata/az$c;->bssmap:Ljava/util/Map;

    .line 13
    .line 14
    iget-object p1, p0, Lcom/tendcloud/tenddata/az$c;->bsslist:Ljava/util/List;

    .line 15
    .line 16
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Lcom/tendcloud/tenddata/az$a;

    .line 31
    .line 32
    iget-object v1, p0, Lcom/tendcloud/tenddata/az$c;->bssmap:Ljava/util/Map;

    .line 33
    .line 34
    invoke-virtual {v0}, Lcom/tendcloud/tenddata/az$a;->getBssid()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    iget-object p1, p0, Lcom/tendcloud/tenddata/az$c;->bssmap:Ljava/util/Map;

    .line 43
    .line 44
    return-object p1
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

.method getPoiId()J
    .locals 2

    iget-wide v0, p0, Lcom/tendcloud/tenddata/az$c;->poiId:J

    return-wide v0
.end method

.method getTimestamp()I
    .locals 1

    iget v0, p0, Lcom/tendcloud/tenddata/az$c;->timestamp:I

    return v0
.end method

.method setBsslist(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/tendcloud/tenddata/az$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/tendcloud/tenddata/az$c;->bsslist:Ljava/util/List;

    return-void
.end method

.method setPoiId(J)V
    .locals 0

    iput-wide p1, p0, Lcom/tendcloud/tenddata/az$c;->poiId:J

    return-void
.end method

.method setTimestamp(I)V
    .locals 0

    iput p1, p0, Lcom/tendcloud/tenddata/az$c;->timestamp:I

    return-void
.end method
