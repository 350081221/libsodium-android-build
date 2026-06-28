.class public Lcom/huawei/agconnect/apms/wxy;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static ghi:Lcom/huawei/agconnect/apms/wxy;


# instance fields
.field public abc:I

.field public bcd:I

.field public cde:I

.field public def:I

.field public efg:J

.field public fgh:J


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static cde()Lcom/huawei/agconnect/apms/wxy;
    .locals 2

    .line 1
    sget-object v0, Lcom/huawei/agconnect/apms/wxy;->ghi:Lcom/huawei/agconnect/apms/wxy;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const-class v0, Lcom/huawei/agconnect/apms/wxy;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    sget-object v1, Lcom/huawei/agconnect/apms/wxy;->ghi:Lcom/huawei/agconnect/apms/wxy;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Lcom/huawei/agconnect/apms/wxy;

    .line 13
    .line 14
    invoke-direct {v1}, Lcom/huawei/agconnect/apms/wxy;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v1, Lcom/huawei/agconnect/apms/wxy;->ghi:Lcom/huawei/agconnect/apms/wxy;

    .line 18
    .line 19
    invoke-virtual {v1}, Lcom/huawei/agconnect/apms/wxy;->bcd()V

    .line 20
    .line 21
    .line 22
    :cond_0
    monitor-exit v0

    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception v1

    .line 25
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    throw v1

    .line 27
    :cond_1
    :goto_0
    sget-object v0, Lcom/huawei/agconnect/apms/wxy;->ghi:Lcom/huawei/agconnect/apms/wxy;

    .line 28
    .line 29
    return-object v0
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
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


# virtual methods
.method public abc()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/huawei/agconnect/apms/wxy;->abc:I

    return v0
.end method

.method public abc(Lcom/huawei/agconnect/apms/wxy;)V
    .locals 2

    .line 2
    iget v0, p1, Lcom/huawei/agconnect/apms/wxy;->abc:I

    .line 3
    iput v0, p0, Lcom/huawei/agconnect/apms/wxy;->abc:I

    .line 4
    iget v0, p1, Lcom/huawei/agconnect/apms/wxy;->bcd:I

    .line 5
    iput v0, p0, Lcom/huawei/agconnect/apms/wxy;->bcd:I

    .line 6
    iget v0, p1, Lcom/huawei/agconnect/apms/wxy;->cde:I

    .line 7
    iput v0, p0, Lcom/huawei/agconnect/apms/wxy;->cde:I

    .line 8
    iget v0, p1, Lcom/huawei/agconnect/apms/wxy;->def:I

    .line 9
    iput v0, p0, Lcom/huawei/agconnect/apms/wxy;->def:I

    .line 10
    iget-wide v0, p1, Lcom/huawei/agconnect/apms/wxy;->efg:J

    .line 11
    iput-wide v0, p0, Lcom/huawei/agconnect/apms/wxy;->efg:J

    .line 12
    iget-wide v0, p1, Lcom/huawei/agconnect/apms/wxy;->fgh:J

    .line 13
    iput-wide v0, p0, Lcom/huawei/agconnect/apms/wxy;->fgh:J

    return-void
.end method

.method public bcd()V
    .locals 2

    .line 1
    const/16 v0, 0x3c

    .line 2
    .line 3
    iput v0, p0, Lcom/huawei/agconnect/apms/wxy;->abc:I

    .line 4
    .line 5
    const/16 v0, 0x64

    .line 6
    .line 7
    iput v0, p0, Lcom/huawei/agconnect/apms/wxy;->def:I

    .line 8
    .line 9
    const/16 v0, 0x258

    .line 10
    .line 11
    iput v0, p0, Lcom/huawei/agconnect/apms/wxy;->bcd:I

    .line 12
    .line 13
    const/16 v0, 0x3e8

    .line 14
    .line 15
    iput v0, p0, Lcom/huawei/agconnect/apms/wxy;->cde:I

    .line 16
    .line 17
    const-wide/16 v0, 0xf0

    .line 18
    .line 19
    iput-wide v0, p0, Lcom/huawei/agconnect/apms/wxy;->efg:J

    .line 20
    .line 21
    const-wide/16 v0, 0x7530

    .line 22
    .line 23
    iput-wide v0, p0, Lcom/huawei/agconnect/apms/wxy;->fgh:J

    .line 24
    .line 25
    return-void
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
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
