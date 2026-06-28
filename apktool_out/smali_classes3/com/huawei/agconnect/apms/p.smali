.class public Lcom/huawei/agconnect/apms/p;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public abc:Ljava/lang/String;

.field public bcd:I

.field public cde:I

.field public def:I

.field public efg:I

.field public fgh:Z

.field public ghi:Ljava/lang/String;

.field public hij:Ljava/lang/String;

.field public ijk:Ljava/lang/String;

.field public jkl:Z

.field public klm:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/huawei/agconnect/apms/p;->abc:Ljava/lang/String;

    .line 5
    .line 6
    iput p2, p0, Lcom/huawei/agconnect/apms/p;->bcd:I

    .line 7
    .line 8
    const/4 p1, -0x1

    .line 9
    iput p1, p0, Lcom/huawei/agconnect/apms/p;->cde:I

    .line 10
    .line 11
    iput p1, p0, Lcom/huawei/agconnect/apms/p;->def:I

    .line 12
    .line 13
    iput p1, p0, Lcom/huawei/agconnect/apms/p;->efg:I

    .line 14
    .line 15
    const-string p1, ""

    .line 16
    .line 17
    iput-object p1, p0, Lcom/huawei/agconnect/apms/p;->ghi:Ljava/lang/String;

    .line 18
    .line 19
    iput-object p1, p0, Lcom/huawei/agconnect/apms/p;->hij:Ljava/lang/String;

    .line 20
    .line 21
    iput-object p1, p0, Lcom/huawei/agconnect/apms/p;->ijk:Ljava/lang/String;

    .line 22
    .line 23
    iput-object p1, p0, Lcom/huawei/agconnect/apms/p;->klm:Ljava/lang/String;

    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    iput-boolean p1, p0, Lcom/huawei/agconnect/apms/p;->fgh:Z

    .line 27
    .line 28
    iput-boolean p1, p0, Lcom/huawei/agconnect/apms/p;->jkl:Z

    .line 29
    .line 30
    return-void
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
.end method


# virtual methods
.method public abc()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/huawei/agconnect/apms/p;->def:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput-boolean v0, p0, Lcom/huawei/agconnect/apms/p;->fgh:Z

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, Lcom/huawei/agconnect/apms/p;->fgh:Z

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
