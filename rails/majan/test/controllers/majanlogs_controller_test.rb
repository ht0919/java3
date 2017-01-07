require 'test_helper'

class MajanlogsControllerTest < ActionController::TestCase
  setup do
    @majanlog = majanlogs(:one)
  end

  test "should get index" do
    get :index
    assert_response :success
    assert_not_nil assigns(:majanlogs)
  end

  test "should get new" do
    get :new
    assert_response :success
  end

  test "should create majanlog" do
    assert_difference('Majanlog.count') do
      post :create, majanlog: { date: @majanlog.date, name1: @majanlog.name1, name2: @majanlog.name2, name3: @majanlog.name3, name4: @majanlog.name4, num: @majanlog.num, score1: @majanlog.score1, score2: @majanlog.score2, score3: @majanlog.score3, score4: @majanlog.score4 }
    end

    assert_redirected_to majanlog_path(assigns(:majanlog))
  end

  test "should show majanlog" do
    get :show, id: @majanlog
    assert_response :success
  end

  test "should get edit" do
    get :edit, id: @majanlog
    assert_response :success
  end

  test "should update majanlog" do
    patch :update, id: @majanlog, majanlog: { date: @majanlog.date, name1: @majanlog.name1, name2: @majanlog.name2, name3: @majanlog.name3, name4: @majanlog.name4, num: @majanlog.num, score1: @majanlog.score1, score2: @majanlog.score2, score3: @majanlog.score3, score4: @majanlog.score4 }
    assert_redirected_to majanlog_path(assigns(:majanlog))
  end

  test "should destroy majanlog" do
    assert_difference('Majanlog.count', -1) do
      delete :destroy, id: @majanlog
    end

    assert_redirected_to majanlogs_path
  end
end
