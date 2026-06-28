.class public final Lcom/yuanqi/master/database/DataBaseHelperKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0001\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0002\"\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "MIGRATION_1_2",
        "com/yuanqi/master/database/DataBaseHelperKt$MIGRATION_1_2$1",
        "Lcom/yuanqi/master/database/DataBaseHelperKt$MIGRATION_1_2$1;",
        "MIGRATION_2_3",
        "Landroidx/room/migration/Migration;",
        "getMIGRATION_2_3",
        "()Landroidx/room/migration/Migration;",
        "app_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:Lcom/yuanqi/master/database/DataBaseHelperKt$MIGRATION_1_2$1;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final b:Landroidx/room/migration/Migration;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/yuanqi/master/database/DataBaseHelperKt$MIGRATION_1_2$1;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/yuanqi/master/database/DataBaseHelperKt$MIGRATION_1_2$1;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/yuanqi/master/database/DataBaseHelperKt;->a:Lcom/yuanqi/master/database/DataBaseHelperKt$MIGRATION_1_2$1;

    .line 7
    .line 8
    new-instance v0, Lcom/yuanqi/master/database/DataBaseHelperKt$MIGRATION_2_3$1;

    .line 9
    .line 10
    invoke-direct {v0}, Lcom/yuanqi/master/database/DataBaseHelperKt$MIGRATION_2_3$1;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/yuanqi/master/database/DataBaseHelperKt;->b:Landroidx/room/migration/Migration;

    .line 14
    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public static final synthetic a()Lcom/yuanqi/master/database/DataBaseHelperKt$MIGRATION_1_2$1;
    .locals 1

    sget-object v0, Lcom/yuanqi/master/database/DataBaseHelperKt;->a:Lcom/yuanqi/master/database/DataBaseHelperKt$MIGRATION_1_2$1;

    return-object v0
.end method

.method public static final b()Landroidx/room/migration/Migration;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    sget-object v0, Lcom/yuanqi/master/database/DataBaseHelperKt;->b:Landroidx/room/migration/Migration;

    return-object v0
.end method
