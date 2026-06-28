.class final Lexternal/org/apache/commons/lang3/builder/h$e;
.super Lexternal/org/apache/commons/lang3/builder/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lexternal/org/apache/commons/lang3/builder/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "e"
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x1L


# direct methods
.method constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lexternal/org/apache/commons/lang3/builder/h;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-virtual {p0, v0}, Lexternal/org/apache/commons/lang3/builder/h;->setUseClassName(Z)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lexternal/org/apache/commons/lang3/builder/h;->setUseIdentityHashCode(Z)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lexternal/org/apache/commons/lang3/builder/h;->setUseFieldNames(Z)V

    .line 12
    .line 13
    .line 14
    const-string v0, ""

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lexternal/org/apache/commons/lang3/builder/h;->setContentStart(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v0}, Lexternal/org/apache/commons/lang3/builder/h;->setContentEnd(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-void
    .line 23
.end method

.method private readResolve()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lexternal/org/apache/commons/lang3/builder/h;->SIMPLE_STYLE:Lexternal/org/apache/commons/lang3/builder/h;

    return-object v0
.end method
