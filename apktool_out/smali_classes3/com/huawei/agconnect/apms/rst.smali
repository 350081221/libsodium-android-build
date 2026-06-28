.class public Lcom/huawei/agconnect/apms/rst;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public abc:Z

.field public bcd:Ljava/lang/String;

.field public cde:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/huawei/agconnect/apms/tuv;",
            ">;"
        }
    .end annotation
.end field

.field public def:Ljava/lang/String;

.field public efg:Lcom/huawei/agconnect/apms/stu;

.field public fgh:J

.field public ghi:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    iput-object v0, p0, Lcom/huawei/agconnect/apms/rst;->bcd:Ljava/lang/String;

    .line 7
    .line 8
    new-instance v1, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v1, p0, Lcom/huawei/agconnect/apms/rst;->cde:Ljava/util/List;

    .line 14
    .line 15
    iput-object v0, p0, Lcom/huawei/agconnect/apms/rst;->def:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    iput-wide v0, p0, Lcom/huawei/agconnect/apms/rst;->fgh:J

    .line 22
    .line 23
    return-void
.end method
