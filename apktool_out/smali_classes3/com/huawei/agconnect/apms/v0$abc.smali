.class public Lcom/huawei/agconnect/apms/v0$abc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/agconnect/apms/v0;->ghi()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic abc:J

.field public final synthetic bcd:Ljava/lang/String;

.field public final synthetic cde:Ljava/lang/String;

.field public final synthetic def:J

.field public final synthetic efg:J

.field public final synthetic fgh:J

.field public final synthetic ghi:J

.field public final synthetic hij:J

.field public final synthetic ijk:Lcom/huawei/agconnect/apms/v0;


# direct methods
.method public constructor <init>(Lcom/huawei/agconnect/apms/v0;JLjava/lang/String;Ljava/lang/String;JJJJJ)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/agconnect/apms/v0$abc;->ijk:Lcom/huawei/agconnect/apms/v0;

    iput-wide p2, p0, Lcom/huawei/agconnect/apms/v0$abc;->abc:J

    iput-object p4, p0, Lcom/huawei/agconnect/apms/v0$abc;->bcd:Ljava/lang/String;

    iput-object p5, p0, Lcom/huawei/agconnect/apms/v0$abc;->cde:Ljava/lang/String;

    iput-wide p6, p0, Lcom/huawei/agconnect/apms/v0$abc;->def:J

    iput-wide p8, p0, Lcom/huawei/agconnect/apms/v0$abc;->efg:J

    iput-wide p10, p0, Lcom/huawei/agconnect/apms/v0$abc;->fgh:J

    iput-wide p12, p0, Lcom/huawei/agconnect/apms/v0$abc;->ghi:J

    iput-wide p14, p0, Lcom/huawei/agconnect/apms/v0$abc;->hij:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v14, Lcom/huawei/agconnect/apms/collect/model/event/interaction/ApplicationStartEvent;

    .line 4
    .line 5
    iget-wide v2, v0, Lcom/huawei/agconnect/apms/v0$abc;->abc:J

    .line 6
    .line 7
    iget-object v4, v0, Lcom/huawei/agconnect/apms/v0$abc;->bcd:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v5, v0, Lcom/huawei/agconnect/apms/v0$abc;->cde:Ljava/lang/String;

    .line 10
    .line 11
    iget-wide v6, v0, Lcom/huawei/agconnect/apms/v0$abc;->def:J

    .line 12
    .line 13
    iget-wide v8, v0, Lcom/huawei/agconnect/apms/v0$abc;->efg:J

    .line 14
    .line 15
    iget-wide v10, v0, Lcom/huawei/agconnect/apms/v0$abc;->fgh:J

    .line 16
    .line 17
    iget-wide v12, v0, Lcom/huawei/agconnect/apms/v0$abc;->ghi:J

    .line 18
    .line 19
    move-wide v15, v12

    .line 20
    iget-wide v12, v0, Lcom/huawei/agconnect/apms/v0$abc;->hij:J

    .line 21
    .line 22
    move-object v1, v14

    .line 23
    move-wide/from16 v17, v12

    .line 24
    .line 25
    move-wide v12, v15

    .line 26
    move-object/from16 v19, v14

    .line 27
    .line 28
    move-wide/from16 v14, v17

    .line 29
    .line 30
    invoke-direct/range {v1 .. v15}, Lcom/huawei/agconnect/apms/collect/model/event/interaction/ApplicationStartEvent;-><init>(JLjava/lang/String;Ljava/lang/String;JJJJJ)V

    .line 31
    .line 32
    .line 33
    sget-boolean v1, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->selfApplication:Z

    .line 34
    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    iget-object v1, v0, Lcom/huawei/agconnect/apms/v0$abc;->ijk:Lcom/huawei/agconnect/apms/v0;

    .line 38
    .line 39
    iget-object v1, v1, Lcom/huawei/agconnect/apms/v0;->abc:Lcom/huawei/agconnect/apms/n0;

    .line 40
    .line 41
    invoke-virtual {v1}, Lcom/huawei/agconnect/apms/n0;->bcd()Lcom/huawei/agconnect/apms/l0;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    if-eqz v1, :cond_0

    .line 46
    .line 47
    move-object/from16 v2, v19

    .line 48
    .line 49
    invoke-virtual {v2, v1}, Lcom/huawei/agconnect/apms/collect/model/event/interaction/ApplicationStartEvent;->setPageLoadInfo(Lcom/huawei/agconnect/apms/l0;)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    move-object/from16 v2, v19

    .line 54
    .line 55
    :goto_0
    invoke-static {v2}, Lcom/huawei/agconnect/apms/yza;->abc(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    return-void
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
