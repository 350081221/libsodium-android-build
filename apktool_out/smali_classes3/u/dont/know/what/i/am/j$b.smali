.class public Lu/dont/know/what/i/am/j$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu/dont/know/what/i/am/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public final a:Lu/dont/know/what/i/am/j$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lu/dont/know/what/i/am/j$c<",
            "Lu/dont/know/what/i/am/g;",
            ">;"
        }
    .end annotation
.end field

.field public final b:[Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public final c:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lu/dont/know/what/i/am/j$c;[Ljava/lang/Class;Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu/dont/know/what/i/am/j$c<",
            "Lu/dont/know/what/i/am/g;",
            ">;[",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lu/dont/know/what/i/am/j$b;->a:Lu/dont/know/what/i/am/j$c;

    .line 4
    iput-object p2, p0, Lu/dont/know/what/i/am/j$b;->b:[Ljava/lang/Class;

    .line 5
    iput-object p3, p0, Lu/dont/know/what/i/am/j$b;->c:Ljava/lang/Class;

    return-void
.end method

.method synthetic constructor <init>(Lu/dont/know/what/i/am/j$c;[Ljava/lang/Class;Ljava/lang/Class;Lu/dont/know/what/i/am/j$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lu/dont/know/what/i/am/j$b;-><init>(Lu/dont/know/what/i/am/j$c;[Ljava/lang/Class;Ljava/lang/Class;)V

    return-void
.end method
