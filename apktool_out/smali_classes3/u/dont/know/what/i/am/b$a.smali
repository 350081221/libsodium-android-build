.class public final Lu/dont/know/what/i/am/b$a;
.super Lu/dont/know/what/i/am/n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu/dont/know/what/i/am/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Lu/dont/know/what/i/am/b;


# direct methods
.method public constructor <init>(Lu/dont/know/what/i/am/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lu/dont/know/what/i/am/n;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu/dont/know/what/i/am/b$a;->a:Lu/dont/know/what/i/am/b;

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
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
    .line 24
    .line 25
    .line 26
    .line 27
.end method


# virtual methods
.method public b(Lu/dont/know/what/i/am/n$a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    iget-object v0, p0, Lu/dont/know/what/i/am/b$a;->a:Lu/dont/know/what/i/am/b;

    invoke-interface {v0, p1}, Lu/dont/know/what/i/am/b;->b(Lu/dont/know/what/i/am/n$a;)V

    return-void
.end method
