.class public final Lcom/huawei/hms/analytics/au;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public ikl:Z

.field public klm:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public lmn:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/hms/analytics/au;->ikl:Z

    return-void
.end method
