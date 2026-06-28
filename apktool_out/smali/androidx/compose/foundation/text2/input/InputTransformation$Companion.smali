.class public final Landroidx/compose/foundation/text2/input/InputTransformation$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/foundation/text2/input/InputTransformation;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ@\u0010\n\u001a\u00020\t26\u0010\u0008\u001a2\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\u000c\u0008\u0004\u0012\u0008\u0008\u0005\u0012\u0004\u0008\u0008(\u0006\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\u000c\u0008\u0004\u0012\u0008\u0008\u0005\u0012\u0004\u0008\u0008(\u0007\u0012\u0004\u0012\u00020\u00030\u0002H\u0007\u00a8\u0006\r"
    }
    d2 = {
        "Landroidx/compose/foundation/text2/input/InputTransformation$Companion;",
        "",
        "Lkotlin/Function2;",
        "",
        "Lkotlin/v0;",
        "name",
        "current",
        "proposed",
        "transformation",
        "Landroidx/compose/foundation/text2/input/InputTransformation;",
        "byValue",
        "<init>",
        "()V",
        "foundation_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field static final synthetic $$INSTANCE:Landroidx/compose/foundation/text2/input/InputTransformation$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/foundation/text2/input/InputTransformation$Companion;

    invoke-direct {v0}, Landroidx/compose/foundation/text2/input/InputTransformation$Companion;-><init>()V

    sput-object v0, Landroidx/compose/foundation/text2/input/InputTransformation$Companion;->$$INSTANCE:Landroidx/compose/foundation/text2/input/InputTransformation$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final byValue(Lv3/p;)Landroidx/compose/foundation/text2/input/InputTransformation;
    .locals 1
    .param p1    # Lv3/p;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/compose/foundation/ExperimentalFoundationApi;
    .end annotation

    .annotation build Landroidx/compose/runtime/Stable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/p<",
            "-",
            "Ljava/lang/CharSequence;",
            "-",
            "Ljava/lang/CharSequence;",
            "+",
            "Ljava/lang/CharSequence;",
            ">;)",
            "Landroidx/compose/foundation/text2/input/InputTransformation;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    new-instance v0, Landroidx/compose/foundation/text2/input/InputTransformationByValue;

    invoke-direct {v0, p1}, Landroidx/compose/foundation/text2/input/InputTransformationByValue;-><init>(Lv3/p;)V

    return-object v0
.end method
