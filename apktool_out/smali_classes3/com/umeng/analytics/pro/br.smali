.class public interface abstract Lcom/umeng/analytics/pro/br;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Lcom/umeng/analytics/pro/br<",
        "**>;F::",
        "Lcom/umeng/analytics/pro/by;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/io/Serializable;"
    }
.end annotation


# virtual methods
.method public abstract clear()V
.end method

.method public abstract deepCopy()Lcom/umeng/analytics/pro/br;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/umeng/analytics/pro/br<",
            "TT;TF;>;"
        }
    .end annotation
.end method

.method public abstract fieldForId(I)Lcom/umeng/analytics/pro/by;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TF;"
        }
    .end annotation
.end method

.method public abstract read(Lcom/umeng/analytics/pro/cq;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation
.end method

.method public abstract write(Lcom/umeng/analytics/pro/cq;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation
.end method
