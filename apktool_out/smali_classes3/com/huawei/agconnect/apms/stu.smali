.class public Lcom/huawei/agconnect/apms/stu;
.super Lcom/huawei/agconnect/apms/collect/type/CollectableArray;
.source "SourceFile"


# instance fields
.field public abc:J

.field public bcd:J

.field public cde:J

.field public def:J

.field public efg:J

.field public fgh:J

.field public ghi:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Lcom/huawei/agconnect/apms/collect/type/CollectableArray;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Runtime;Landroid/app/ActivityManager$MemoryInfo;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/huawei/agconnect/apms/collect/type/CollectableArray;-><init>()V

    .line 2
    invoke-virtual {p1}, Ljava/lang/Runtime;->maxMemory()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/agconnect/apms/stu;->abc:J

    .line 3
    invoke-virtual {p1}, Ljava/lang/Runtime;->totalMemory()J

    move-result-wide v0

    invoke-virtual {p1}, Ljava/lang/Runtime;->freeMemory()J

    move-result-wide v2

    sub-long/2addr v0, v2

    iput-wide v0, p0, Lcom/huawei/agconnect/apms/stu;->bcd:J

    .line 4
    invoke-virtual {p1}, Ljava/lang/Runtime;->freeMemory()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/agconnect/apms/stu;->cde:J

    .line 5
    iget-wide v0, p2, Landroid/app/ActivityManager$MemoryInfo;->availMem:J

    iput-wide v0, p0, Lcom/huawei/agconnect/apms/stu;->def:J

    .line 6
    iget-wide v0, p2, Landroid/app/ActivityManager$MemoryInfo;->totalMem:J

    iput-wide v0, p0, Lcom/huawei/agconnect/apms/stu;->efg:J

    .line 7
    iget-wide v0, p2, Landroid/app/ActivityManager$MemoryInfo;->threshold:J

    iput-wide v0, p0, Lcom/huawei/agconnect/apms/stu;->fgh:J

    .line 8
    iget-boolean p1, p2, Landroid/app/ActivityManager$MemoryInfo;->lowMemory:Z

    iput-boolean p1, p0, Lcom/huawei/agconnect/apms/stu;->ghi:Z

    return-void
.end method


# virtual methods
.method public asJsonArray()Lorg/json/JSONArray;
    .locals 3

    .line 1
    new-instance v0, Lorg/json/JSONArray;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-wide v1, p0, Lcom/huawei/agconnect/apms/stu;->abc:J

    .line 7
    .line 8
    invoke-static {v1, v2, v0}, Lcom/huawei/agconnect/apms/abc;->abc(JLorg/json/JSONArray;)V

    .line 9
    .line 10
    .line 11
    iget-wide v1, p0, Lcom/huawei/agconnect/apms/stu;->bcd:J

    .line 12
    .line 13
    invoke-static {v1, v2, v0}, Lcom/huawei/agconnect/apms/abc;->abc(JLorg/json/JSONArray;)V

    .line 14
    .line 15
    .line 16
    iget-wide v1, p0, Lcom/huawei/agconnect/apms/stu;->cde:J

    .line 17
    .line 18
    invoke-static {v1, v2, v0}, Lcom/huawei/agconnect/apms/abc;->abc(JLorg/json/JSONArray;)V

    .line 19
    .line 20
    .line 21
    iget-wide v1, p0, Lcom/huawei/agconnect/apms/stu;->def:J

    .line 22
    .line 23
    invoke-static {v1, v2, v0}, Lcom/huawei/agconnect/apms/abc;->abc(JLorg/json/JSONArray;)V

    .line 24
    .line 25
    .line 26
    iget-wide v1, p0, Lcom/huawei/agconnect/apms/stu;->efg:J

    .line 27
    .line 28
    invoke-static {v1, v2, v0}, Lcom/huawei/agconnect/apms/abc;->abc(JLorg/json/JSONArray;)V

    .line 29
    .line 30
    .line 31
    iget-wide v1, p0, Lcom/huawei/agconnect/apms/stu;->fgh:J

    .line 32
    .line 33
    invoke-static {v1, v2, v0}, Lcom/huawei/agconnect/apms/abc;->abc(JLorg/json/JSONArray;)V

    .line 34
    .line 35
    .line 36
    iget-boolean v1, p0, Lcom/huawei/agconnect/apms/stu;->ghi:Z

    .line 37
    .line 38
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-static {v1}, Lcom/huawei/agconnect/apms/t1;->abc(Ljava/lang/Boolean;)Ljava/lang/Boolean;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 47
    .line 48
    .line 49
    return-object v0
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
