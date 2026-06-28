.class public Lo/c$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# static fields
.field public static final a:Lo/c;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lo/c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/c;-><init>(Lo/c$a;)V

    sput-object v0, Lo/c$b;->a:Lo/c;

    return-void
.end method
