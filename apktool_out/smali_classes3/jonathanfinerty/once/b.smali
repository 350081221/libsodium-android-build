.class public final synthetic Ljonathanfinerty/once/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljonathanfinerty/once/CountChecker;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ljonathanfinerty/once/b;->a:I

    return-void
.end method


# virtual methods
.method public final check(I)Z
    .locals 1

    iget v0, p0, Ljonathanfinerty/once/b;->a:I

    invoke-static {v0, p1}, Ljonathanfinerty/once/Amount;->b(II)Z

    move-result p1

    return p1
.end method
