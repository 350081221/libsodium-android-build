.class public final Lcom/huawei/hms/analytics/df;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hms/analytics/df$lmn;,
        Lcom/huawei/hms/analytics/df$klm;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/io/Serializable;",
        "Ljava/util/Comparator<",
        "Lcom/huawei/hms/analytics/ax;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lcom/huawei/hms/analytics/ax;

    check-cast p2, Lcom/huawei/hms/analytics/ax;

    iget-object p1, p1, Lcom/huawei/hms/analytics/ax;->lmn:Ljava/lang/String;

    iget-object p2, p2, Lcom/huawei/hms/analytics/ax;->lmn:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    return p1
.end method
