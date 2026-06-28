.class final Lcom/tendcloud/tenddata/bq;
.super Landroid/telephony/PhoneStateListener;
.source "SourceFile"


# static fields
.field static final a:J = 0x2bf20L


# instance fields
.field b:J

.field c:J

.field d:I

.field e:I


# direct methods
.method constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroid/telephony/PhoneStateListener;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    iput-wide v0, p0, Lcom/tendcloud/tenddata/bq;->b:J

    .line 7
    .line 8
    iput-wide v0, p0, Lcom/tendcloud/tenddata/bq;->c:J

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    iput v0, p0, Lcom/tendcloud/tenddata/bq;->e:I

    .line 12
    .line 13
    return-void
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

.method private a()V
    .locals 2

    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/bm;->a:Landroid/os/Handler;

    new-instance v1, Lcom/tendcloud/tenddata/bq$1;

    invoke-direct {v1, p0}, Lcom/tendcloud/tenddata/bq$1;-><init>(Lcom/tendcloud/tenddata/bq;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method


# virtual methods
.method public onCellLocationChanged(Landroid/telephony/CellLocation;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Landroid/telephony/gsm/GsmCellLocation;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    check-cast p1, Landroid/telephony/gsm/GsmCellLocation;

    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/telephony/gsm/GsmCellLocation;->getLac()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    iput p1, p0, Lcom/tendcloud/tenddata/bq;->d:I

    .line 20
    .line 21
    invoke-direct {p0}, Lcom/tendcloud/tenddata/bq;->a()V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const-class v1, Landroid/telephony/cdma/CdmaCellLocation;

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    check-cast p1, Landroid/telephony/cdma/CdmaCellLocation;

    .line 38
    .line 39
    invoke-virtual {p1}, Landroid/telephony/cdma/CdmaCellLocation;->getNetworkId()I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    iput p1, p0, Lcom/tendcloud/tenddata/bq;->d:I

    .line 44
    .line 45
    invoke-direct {p0}, Lcom/tendcloud/tenddata/bq;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    .line 47
    .line 48
    :catchall_0
    :cond_1
    :goto_0
    return-void
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
