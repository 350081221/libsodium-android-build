.class public Lcom/huawei/agconnect/apms/k;
.super Ljava/util/EventObject;
.source "SourceFile"


# instance fields
.field public abc:J

.field public bcd:Ljava/lang/Exception;


# direct methods
.method public constructor <init>(Ljava/lang/Object;J)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ljava/util/EventObject;-><init>(Ljava/lang/Object;)V

    .line 2
    iput-wide p2, p0, Lcom/huawei/agconnect/apms/k;->abc:J

    const/4 p1, 0x0

    .line 3
    iput-object p1, p0, Lcom/huawei/agconnect/apms/k;->bcd:Ljava/lang/Exception;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;JLjava/lang/Exception;)V
    .locals 0

    .line 4
    invoke-direct {p0, p1}, Ljava/util/EventObject;-><init>(Ljava/lang/Object;)V

    .line 5
    iput-wide p2, p0, Lcom/huawei/agconnect/apms/k;->abc:J

    .line 6
    iput-object p4, p0, Lcom/huawei/agconnect/apms/k;->bcd:Ljava/lang/Exception;

    return-void
.end method
